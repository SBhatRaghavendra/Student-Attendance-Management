<%-- 
    Document   : updated
    Created on : Oct 3, 2017, 10:12:59 PM
    Author     : pc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Faculty Validation</title>
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
    <body>
        
        <%

        	ArrayList<String> al=new ArrayList<String>();
        	al.add("Computer_Science_and_Engineering");//Adding object in arraylist  
		al.add("Mechanical_Engineering");  
 		al.add("Electronics_and_Communication_Engineering");  
		al.add("Electronics_and_Electicals_Engineering");  
            String fname=request.getParameter("name");
            String Faculty_id= request.getParameter("Faculty_id");
            String contactNo=request.getParameter("contactNo");
            String dept= request.getParameter("dept");
            String gender=request.getParameter("gender");  
            String sem1=request.getParameter("sem1");
            String course1=request.getParameter("course1");
            String password= request.getParameter("password");
            String confirm_password= request.getParameter("confirm_password");
            String section1=request.getParameter("section1");

            
            String sem2=request.getParameter("sem2");
            String section2=request.getParameter("section2");
            String course2=request.getParameter("course2");
       		int test=1;

       		if(sem2.equals("select")&&section2.equals("select")&&course2.equals("select")){
       			test=-1;
       		}
       		else if(sem2.equals("select")||section2.equals("select")||course2.equals("select")){
       				session.setAttribute("wrong_details", "1");
                    response.sendRedirect("addFaculty.jsp");
       		}
       		



			Connection con = null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
           String radioSelection;
           try {
                 radioSelection= request.getParameter("type_addFaculty");
                 if(radioSelection.equals("male")) {
                    gender="male";
                    
                }
                else if(radioSelection.equals("female")) {
                     gender="female";
                   
                }
                
             }
            catch(NullPointerException e)
           {
               request.setAttribute("errMsg", "Please select the gender");
               RequestDispatcher rd = request.getRequestDispatcher("addFaculty.jsp");
               rd.forward(request, response);
           }
           if(!password.equals(confirm_password))
                {
                    session.setAttribute("wrong_pass", "1");
                    response.sendRedirect("addFaculty.jsp");
                }
           else{
           try {
                Statement stat=con.createStatement();
                PreparedStatement statement = con.prepareStatement("select course_id from course where course_name=?");
				statement.setString(1, course1);
                ResultSet result1 = statement.executeQuery();
                if(!result1.next())
                {
                	out.println("No records");
                }
                String actual_courseid=null;
                do{
                	String str=result1.getString(1);
                	if(str.length()==4){
                		if(sem1.equals(str.substring(0,3)))    // 0,2 check
                			actual_courseid=str;
                    }
                    if(str.length()==5){
        				if(sem1.equals(str.substring(0,4)))
        					actual_courseid=str;
                }
                }while(result1.next());
                int semester=0,sec_number=0;
                int dept_index=(al.indexOf(dept)+1);
                if(sem1.length()==3){
                		semester=sem1.charAt(2);
          		 }
          		 else if(sem1.length()==4){
                		semester=sem1.charAt(3);
          		 }
          		if(section1.equals("a"))
          			sec_number=1;
          		if(section1.equals("b"))
          			sec_number=2;	
          		String actual_deptno=Integer.toString(dept_index);
          		String Ssection=Integer.toString(dept_index)+Integer.toString(semester)+Integer.toString(sec_number);
                stat.executeQuery("insert into FACULTY(F_ID,FACULTY_NAME,PASSWORD,DEPT_ID,COURSE_ID,CONTACT_NO,GENDER,SEC_ID) values('"+Faculty_id+"','"+fname+"','"+password+"','"+actual_deptno+"','"+actual_courseid+"','"+contactNo+"','"+gender+"','"+Ssection+"')");
            } catch (SQLException e) {
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 5"+e);
            } 

            try{
            if(test==1){
            	Statement stat1=con.createStatement();
                PreparedStatement statement1 = con.prepareStatement("select course_id from course where course_name=?");
                statement1.setString(1, course2);
                ResultSet result2 = statement1.executeQuery();
                if(!result2.next())
                {
                	out.println("No records");
                }
                String actual_courseid1=null;
                do{
                	String str1=result2.getString(1);
                	if(str1.length()==4){
                		if(sem2.equals(str1.substring(0,3)))    // 0,2 check
                			actual_courseid1=str1;
                    }
                    if(str1.length()==5){
        				if(sem2.equals(str1.substring(0,4)))
        					actual_courseid1=str1;
                	}
            	}while(result2.next());
                int semester1=0,sec_number1=0;
                int dept_index1=(al.indexOf(dept)+1);
                if(sem2.length()==3){
                		semester1=sem2.charAt(2);
          		 }
          		 else if(sem2.length()==4){
                		semester1=sem2.charAt(3);
          		 }
          		if(section2.equals("a"))
          			sec_number1=1;
          		if(section2.equals("b"))
          			sec_number1=2;	
          		String actual_deptno1=Integer.toString(dept_index1);
          		String Ssection1=Integer.toString(dept_index1)+Integer.toString(semester1)+Integer.toString(sec_number1);
                stat1.executeQuery("insert into FACULTY(F_ID,FACULTY_NAME,PASSWORD,DEPT_ID,COURSE_ID,CONTACT_NO,GENDER,SEC_ID) values('"+Faculty_id+"','"+fname+"','"+password+"','"+actual_deptno1+"','"+actual_courseid1+"','"+contactNo+"','"+gender+"','"+Ssection1+"')");
       		}
       } catch (SQLException e) {
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 6"+e);
            } 


            try{
            %>
                <br>
                <br>
                <center><p style="color:blueviolet;font-size: 30px">Data Entered Successfully</p></center>
                <br>
                <br>
                <br>
                <div class="btn-group">
                    <form action="addFaculty.jsp" method="post">
                         <center><button class="button">Continue</button></center>
                    </form>
                </div>
            <%
            }catch(Exception e){

            }
           }
           %>
 
    </body>
</html>



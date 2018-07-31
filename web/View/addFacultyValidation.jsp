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
            String sem1=request.getParameter("sem1");
            String course1=request.getParameter("course1");
            String password= request.getParameter("password");
            String confirm_password= request.getParameter("confirm_password");
            String section1=request.getParameter("section1");

            
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
            String gender=null;
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
                //out.println(course1);
                PreparedStatement statement = con.prepareStatement("select course_id from course where course_name=?");
		statement.setString(1,course1);
                ResultSet result1 = statement.executeQuery();
                if(!result1.next())
                {
                	out.println("No records");
                }
                out.println("records");
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
                    
                //out.println("records11");
                }while(result1.next());
                int sec_number=0;
                char semester='0';
                int dept_index=(al.indexOf(dept)+1);
                if(sem1.length()==3){
                		semester=sem1.charAt(2);
                                
                   //out.println("     semester"+sem1.charAt(2));    
          		 }
          		 else if(sem1.length()==4){
                		semester=sem1.charAt(3);
                                //out.println("     semester"+sem1.charAt(3)); 
          		 }
          		if(section1.equals("a"))
          			sec_number=1;
          		if(section1.equals("b"))
          			sec_number=2;	
          		String actual_deptno=Integer.toString(dept_index);
                   //out.println("     semester"+semester);    
                //out.println("     actual_deptno"+actual_deptno);
          		String Ssection=Integer.toString(dept_index)+semester+Integer.toString(sec_number);
               
                //out.println("    Ssection"+Ssection);
                        
                        stat.executeQuery("insert into FACULTY(F_ID,FACULTY_NAME,PASSWORD,DEPT_ID,COURSE_ID,CONTACT_NO,GENDER,SEC_ID) values('"+Faculty_id+"','"+fname+"','"+password+"','"+actual_deptno+"','"+actual_courseid+"','"+contactNo+"','"+gender+"','"+Ssection+"')");
            } catch (SQLException e) {
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 5"+e);
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



<%-- 
    Document   : updated
    Created on : Oct 3, 2017, 10:12:59 PM
    Author     : pc
--%>

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
        <title>Add Student Validation</title>
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
    <body>
        
        <%
            String fname=request.getParameter("FNAME");
            String mname=request.getParameter("MNAME");
            String lname=request.getParameter("LNAME");
            String usn= request.getParameter("USN");
            String contact_no=request.getParameter("CONTACT_NO");
            String department= request.getParameter("DEPARTMENT");
            String presentAddress= request.getParameter("Present_Address");
            String permanentAddress= request.getParameter("Permanent_Address");
            String gender=request.getParameter("GENDER");  
            String s_id= request.getParameter("SECTION_ID");
            String email_id= request.getParameter("EMAIL_ID");
            String parent_name= request.getParameter("PARENT_NAME");
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
                 radioSelection= request.getParameter("type_addStudent");
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
               RequestDispatcher rd = request.getRequestDispatcher("addStudent.jsp");
               rd.forward(request, response);
           }
           Statement stat=con.createStatement();
          // String d_id=result.getString(1);
            //    String s_id=result.getString(2);
           try{
           	    PreparedStatement statement = con.prepareStatement("select dpt_id from department where dpt_name=?");
           	    statement.setString(1,department);
           	    ResultSet result = statement.executeQuery();
           	    if(!result.next()){
                        out.println("no records");
           	    }
           	    else{
           	    String dept_id=result.getString("dpt_id");
                    stat.executeQuery("insert into student(USN,FNAME,MNAME,LNAME,DEPT_ID,SECTION_ID,CONTACT_NO,GENDER,PARENT_NAME,EMAIL_ID) values('"+usn+"','"+fname+"','"+mname+"','"+lname+"','"+dept_id+"','"+s_id+"','"+contact_no+"','"+gender+"','"+parent_name+"','"+email_id+"')");
                    PreparedStatement statement1 = con.prepareStatement("insert into ADDRESS(USN,PRESENT_ADDRESS,PERMANENT_ADDRESS) values(?,?,?)");
                    statement1.setString(1,usn);
                    statement1.setString(2,presentAddress);
                    statement1.setString(3,permanentAddress);
                    ResultSet result1=statement1.executeQuery();
                    if(!result1.next())
                    {
                        out.println("No records");
                    }
           		}
            } catch (SQLException e) {
                out.println("error"+e);
//                session.setAttribute("wrong_query", "1");
//                response.sendRedirect("addStudent.jsp");
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
                    <form action="addStudent.jsp" method="post">
                         <center><button class="button">Continue</button></center>
                    </form>
                </div>
            <%
            }catch(Exception e){

            }
   
           %>
 
    </body>
</html>



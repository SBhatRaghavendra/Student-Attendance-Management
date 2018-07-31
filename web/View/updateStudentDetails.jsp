<%-- 
    Document   : updateFacultyDetails
    Created on : 31 Oct, 2017, 10:18:17 PM
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
        <title>Update Student Details</title>
    <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css"> 
    </head>
    <body id="top">
             <%
          if(session.getAttribute("wrong_query") != null){
        %>
        <script>
                alert("Please enter valid Details");
        </script>
        <%
          session.removeAttribute("wrong_query");
          }
        %>
            <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null};
            </script>
            <%
            String fname=request.getParameter("fname");
            String usn= request.getParameter("usn");
            session.setAttribute("susn",usn);
            Connection con = null;
            ResultSet result=null;
            ResultSet result1=null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } 
            catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught:2 ");
            }
            PreparedStatement stat=null;
            PreparedStatement stat1=null;
            try {
                stat=con.prepareStatement("select * from student where USN=?");
                stat.setString(1,usn);
                result=stat.executeQuery();
                stat1=con.prepareStatement("select * from address where USN=?");
                stat1.setString(1,usn);
                result1=stat1.executeQuery();
                 
            }
            catch (SQLException e) {
                 out.println("SQLException caught:4S ");
            }
           boolean rs=result.next();
           boolean rs1=result1.next();
           if(!rs)
           {
               session.setAttribute("wrong_uname", "1");
               response.sendRedirect("updateStudent.jsp");
           }
           if(!rs1)
           {
               session.setAttribute("wrong_uname", "1");
               response.sendRedirect("updateStudent.jsp");
           }
           String mname=null;
//          if(rs){
//            if(result.getString("MNAME").equals(null))
//            {
//                mname="";
//            }
//            else
//            {
//                mname=result.getString("MNAME");
//            }
           if(rs){
            %>
            <h1 class="heading">UPDATE STUDENT DETAILS<img src="../assets/images/admin.jpg" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="goBack()" style="background-color: #d6d6c2;
                border: none;
                color: #0052cc ;
                padding: 10px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                cursor: pointer;
                border-radius: 5px;
                float:right;" >Back</button></h1>
		<script src="../JS/backButton.js"></script>
            <form action="updatedStudent.jsp" method="POST">
              <table border = "1" width = "50%" align="center"  style="color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px">
                <tr>
                    <td>FNAME:</td>
                    <td><input type="text" name="fname" value="<%= result.getString("FNAME") %>" /></td>
                </tr>
                <tr>
                    <td>MNAME:</td>
                    <td><input type="text" name="mname" value="<%=result.getString("MNAME")%>" /></td>
                </tr>
                <tr>
                    <td>LNAME:</td>
                    <td><input type="text" name="lname" value="<%= result.getString("LNAME") %>" /></td>
                </tr>
                <tr>
                    <td>USN:</td>
                    <td><input type="text" name="usn" value="<%= result.getString("USN") %>" /></td>
                </tr>
                 <tr>
                    <td>GENDER:</td>
                    <td><input type="text" name="gender" value="<%= result.getString("GENDER") %>" /></td>
                </tr>
                <tr>
                    <td>Dept_ID:</td>
                    <td><input type="text" name="dept_id" value="<%= result.getString("DEPT_ID") %>" /></td>
                </tr>
                <tr>
                    <td>Section_id:</td>
                    <td><input type="text" name="section_id" value="<%= result.getString("section_id") %>" /></td>
                </tr>
                <tr>
                    <td>Contact_No.:</td>
                    <td><input type="text" name="contact_no" value="<%= result.getString("CONTACT_NO") %>" /></td>
                </tr>
                <tr>
                    <td>Email_id:</td>
                    <td><input type="text" name="email_id" value="<%= result.getString("EMAIL_ID") %>" /></td>
                </tr>
                <tr>
                    <td>PARENT NAME:</td>
                    <td><input type="text" name="parent_name" value="<%= result.getString("parent_name") %>" /></td>
                </tr>
                <tr>
                    <td>PRESENT ADDRESS:</td>
                    <td><input type="text" name="present_address" value="<%= result1.getString("PRESENT_ADDRESS") %>" /></td>
                </tr>
                <tr>
                    <td>PERMANENT ADDRESS:</td>
                    <td><input type="text" name="permanent_address" value="<%= result1.getString("PERMANENT_ADDRESS") %>" /></td>
                </tr>
              </table>
                
                <br><br><br>
                <div class="btn-group">
                     <center><button class="button">Update</button></center>
	        </div>
          </form>
                <br>
                    <br>
            <%}%>
         
    </body>
</html>

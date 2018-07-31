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
        <title>Update Faculty Details</title>
    <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css"> 
    </head>
    <body id="top">
            <%
            String fname=request.getParameter("fname");
            String fid= request.getParameter("fid");
            session.setAttribute("FID",fid);
            Connection con = null;
            ResultSet result=null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            PreparedStatement stat=null;
            try {
                stat=con.prepareStatement("select * from faculty where faculty_name=? and F_ID=?");
                stat.setString(1,fname);
                stat.setString(2,fid);
                result=stat.executeQuery();
                 
            }
            catch (SQLException e) {
                 out.println("SQLException caught:4S ");
            }
           boolean rs=result.next();
           if(!rs)
           {
               session.setAttribute("wrong_uname", "1");
               response.sendRedirect("update_faculty.jsp");
           }
                 session.setAttribute("facultyId", result.getString("F_ID"));
          if(rs){%>
            <h1 class="heading">UPDATE FACULTY DETAILS<img src="../assets/images/admin.jpg" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="location.href='update_faculty.jsp'" style="background-color: #d6d6c2;
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
            <form action="updatedFaculty.jsp" method="POST">
              <table border = "1" width = "50%" align="center"  style="color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px">
                <tr>
                    <td>Faculty Name:</td>
                    <td><input type="text" name="faculty_name" value="<%= result.getString("FACULTY_NAME") %>" /></td>
                </tr>
                <tr>
                    <td>Faculty ID:</td>
                    <td><input type="text" name="f_id" value="<%= result.getString("F_ID") %>" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" value="<%= result.getString("PASSWORD") %>" /></td>
                </tr>
                <tr>
                    <td>Dept ID:</td>
                    <td><input type="text" name="dept_id" value="<%= result.getString("DEPT_ID") %>" /></td>
                </tr>
                <tr>
                    <td>Contact No.:</td>
                    <td><input type="text" name="contact_no" value="<%= result.getString("CONTACT_NO") %>" /></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><input type="text" name="gender" value="<%= result.getString("GENDER") %>" /></td>
                </tr>
              </table>
                <BR><br>
                
                <br><br><br>
                <div class="btn-group">
                     <center><button class="button">Update</button></center>
	        </div>
          </form>
                <br>
                    <br>
             <center><button onclick="location.href='SubjectDetails.jsp'" style="background-color: #d6d6c2;
                border: none;
                color: #0052cc ;
                padding: 10px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                cursor: pointer;
                border-radius: 5px;" >Subject Details</button></center>
            <%}%>
         
    </body>
</html>

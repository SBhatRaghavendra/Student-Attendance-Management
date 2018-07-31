<%-- 
    Document   : updatedFaculty
    Created on : 1 Nov, 2017, 9:55:51 AM
    Author     : pc
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Updated Faculty Details</title>
    </head>
    <body>
        <script>
               function preventBack(){window.history.forward();}
               setTimeout("preventBack()", 0);
               window.onunload=function(){null};
        </script>
        <%
            String faculty_name=request.getParameter("faculty_name");
            String fid=request.getParameter("f_id");
            String password=request.getParameter("password");
            String dept_id=request.getParameter("dept_id");
            String contact_no=request.getParameter("contact_no");
            String gender=request.getParameter("gender");
            Connection con = null;
            ResultSet result=null;
            
            try {
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught:1 ");
            }
            catch (SQLException e) {
                out.println("SQLException caught:2 ");
            }
            //out.println("connected");
            PreparedStatement stat=null;
            String cvalue=(String)session.getAttribute("FID");         
            try {
                stat=con.prepareStatement("update faculty set FACULTY_NAME=?,F_ID=?,password=?,dept_id=?,contact_no=?,gender=? where F_ID='"+cvalue+"'");
                stat.setString(1, faculty_name);
                stat.setString(2, fid);
                stat.setString(3, password);
                stat.setString(4,dept_id);
                stat.setString(5,contact_no);
                stat.setString(6,gender);
                int i=stat.executeUpdate();
                session.setAttribute("data_success", "1");
               response.sendRedirect("update_faculty.jsp");
                //con.close();
                //stat.close();
                
            } catch (SQLException e) {
                 session.setAttribute("wrong_query", "1");
                 response.sendRedirect("updateFacultyDetails.jsp");
                out.println("ERror"+e);
            }
            
         %>   
    </body>
</html>

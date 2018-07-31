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
        <title>Updated Student Details</title>
    </head>
    <body>
        <script>
               function preventBack(){window.history.forward();}
               setTimeout("preventBack()", 0);
               window.onunload=function(){null};
        </script>
        <%
            String fname=request.getParameter("fname");
            String mname=request.getParameter("mname");
            String lname=request.getParameter("lname");
            String usn=request.getParameter("usn");
            String gender=request.getParameter("gender");
            String dept_id=request.getParameter("dept_id");
            String section_id=request.getParameter("section_id");
            String contact_no=request.getParameter("contact_no");
            String email_id=request.getParameter("email_id");
            String parent_name=request.getParameter("parent_name");
            String present_address=request.getParameter("present_address");
            String permanent_address=request.getParameter("permanent_address");
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
            
            PreparedStatement stat=null;
            PreparedStatement stat1=null;
            String cvalue=(String)session.getAttribute("susn");
            //out.println(cvalue);
            try {
                stat=con.prepareStatement("update student set USN=?,FNAME=?,MNAME=?,LNAME=?,contact_no=?,gender=?,email_id=?,dept_id=?,section_id=?,parent_name=? where usn='"+cvalue+"'");
                stat.setString(1,usn );
                stat.setString(2, fname);
                stat.setString(3, mname);
                stat.setString(4, lname);
                stat.setString(5, contact_no);
                stat.setString(6, gender);
                stat.setString(7, email_id);
                stat.setString(8, dept_id);
                stat.setString(9, section_id);
                stat.setString(10, parent_name);
                int i=stat.executeUpdate();
                stat1=con.prepareStatement("update ADDRESS set USN=?,PRESENT_ADDRESS=?,PERMANENT_ADDRESS=? where usn='"+cvalue+"'");
                stat1.setString(1,usn );
                stat1.setString(2,present_address);
                stat1.setString(3,permanent_address);
                stat1.executeUpdate();
                session.setAttribute("data_success", "1");
                response.sendRedirect("updateStudent.jsp");
                //con.close();
                //stat.close();
                
            } catch (SQLException e) {
                 out.println("Exception error"+e);
            }
            
         %>   
    </body>
</html>

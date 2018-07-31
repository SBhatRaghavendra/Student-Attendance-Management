<%-- 
    Document   : dateValidation
    Created on : 12 Nov, 2017, 3:58:23 PM
    Author     : pc
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
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
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String ddate= request.getParameter("ddate");
            session.setAttribute("dddate",ddate);
            Connection con = null;
            ResultSet result=null;
            ResultSet result1=null;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dateUT=formatter.parse(ddate);
            java.sql.Date date1=java.sql.Date.valueOf(formatter.format(dateUT));
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
                stat=con.prepareStatement("select * from calendar where CAL_DATE=?");
                stat1=con.prepareStatement("select * from attendance where A_DATE=?");
                stat.setDate(1,date1);
                stat1.setDate(1,date1);
                result=stat.executeQuery();
                result1=stat.executeQuery();
                if(!result.next()) {
                    
                    session.setAttribute("statuspass", "pass");
                    response.sendRedirect("update_attendance.jsp");
                    
                }
                else{
                    session.setAttribute("statusfail", "error");
                    response.sendRedirect("update_attendance.jsp");
                }
                    
                 
            }
            catch (SQLException e) {
                 out.println("SQLException caught:4S "+e);
            }
            
            %>
    </body>
</html>

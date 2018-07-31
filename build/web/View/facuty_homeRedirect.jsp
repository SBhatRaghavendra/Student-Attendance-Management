<%-- 
    Document   : addFacSubValid
    Created on : 6 Nov, 2017, 8:15:49 PM
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
        <title>validating </title>
    </head>
    <body>
        <%
        String section=request.getParameter("section");
        session.setAttribute("section",section);
        String radioSelection;
        Connection con = null;
        ResultSet result=null;
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Date utilDate = cal.getTime();
        out.println(utilDate);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sqlDate=java.sql.Date.valueOf(formatter.format(utilDate));
//        java.sql.Date sqlDate = new Date(utilDate.getTime());
        out.println(sqlDate);
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
          PreparedStatement stat=null;
           try {
                radioSelection= request.getParameter("type_Faculty_update");
                 if(radioSelection.equals("update_attendance")) {
                     stat=con.prepareStatement("select * from calendar where CAL_DATE=?");
                     stat.setDate(1,sqlDate);
                    result=stat.executeQuery();
                    if(result.next()) {
                       session.setAttribute("statusfail", "error");
                        response.sendRedirect("faculty_home.jsp");
                    }
                    else{
                        response.sendRedirect("update_attendance.jsp");
                   }  
                 }
                else if(radioSelection.equals("view_report")) {
                     response.sendRedirect("View_report.jsp");
                   
               }               
           }
            catch(NullPointerException e){
               request.setAttribute("errMsg", "Please select the option");
               RequestDispatcher rd = request.getRequestDispatcher("faculty_home.jsp");
               rd.forward(request, response);
           }
           %>
    </body>
</html>
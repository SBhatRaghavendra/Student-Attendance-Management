<%-- 
    Document   : updateAttendanceValidation
    Created on : 13 Nov, 2017, 11:22:37 AM
    Author     : pc
--%>
<%@page import="java.text.SimpleDateFormat"%>
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
            int countJ=Integer.parseInt((String)session.getAttribute("countJ"));
            String course=request.getParameter("course");
            String ddate=request.getParameter("date");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dateUT=formatter.parse(ddate);
            java.sql.Date date1=java.sql.Date.valueOf(formatter.format(dateUT));
            ResultSet result=null;
              
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
            PreparedStatement stat=null; 
            try{
            PreparedStatement statement = con.prepareStatement("insert into ATTENDANCE(S_USN,COURSE_ID,A_DATE,STATUS) values (?,?,?,?)");
            for(int i=0;i<countJ;i++){
            String usn=request.getParameter("usn"+i);
            out.println(usn);
            String status=request.getParameter("p"+i);
            out.println(status);
            statement.setString(1,usn);
            statement.setString(2,course);            
            statement.setDate(3,date1);   // caha
            statement.setString(4,status);
            statement.executeQuery();
            }
            
            session.setAttribute("dataSuccess1", "1");
            response.sendRedirect("faculty_home.jsp");
            }
            catch(SQLException e){
                
              out.println("error"+e);
                
            }
            
        %>
    </body>
</html>

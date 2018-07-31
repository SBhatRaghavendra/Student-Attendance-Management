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
        <title>Login Validation</title>
    </head>
    <body>
        
        <%
            String fname=request.getParameter("name");
            String password= request.getParameter("pass");
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
                 radioSelection= request.getParameter("type_login");
                 if(radioSelection.equals("admin")) {
                    PreparedStatement statement = con.prepareStatement("select ADMIN_ID,ADMIN_PASSWORD from admin where  ADMIN_ID =? and ADMIN_PASSWORD=?");
                    statement.setString(1, fname);
                    statement.setString(2, password);
                    ResultSet result = statement.executeQuery();
                    if(result.next()){
                        response.sendRedirect("View/admin_homepage.jsp");
                    }else{
                        session.setAttribute("wrong_uname_pass", "1");
                        response.sendRedirect("login.jsp");
                    }
                }
                else if(radioSelection.equals("faculty")) {
                    PreparedStatement statement = con.prepareStatement("select F_ID,PASSWORD from faculty where  F_ID =? and PASSWORD=?");
                    statement.setString(1, fname);
                    statement.setString(2, password);
                    ResultSet result = statement.executeQuery();
                    if(result.next()){
                        session.setAttribute("fid",fname);
                        response.sendRedirect("View/faculty_home.jsp");
                    }else{
                        session.setAttribute("wrong_uname_pass", "1");
                        response.sendRedirect("login.jsp");
                    }
                }
                
             }
            catch(NullPointerException e)
           {
               request.setAttribute("errMsg", "Please select the type of user");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
               rd.forward(request, response);
           } 
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            %>
    </body>
</html>
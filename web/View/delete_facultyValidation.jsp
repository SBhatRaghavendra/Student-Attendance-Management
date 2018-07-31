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
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
    <body>
        
        <%
            String facname=request.getParameter("fname");
            String facId= request.getParameter("fid");
            

           
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
           
            try {
                Statement stat=con.createStatement();
                PreparedStatement statement = con.prepareStatement("select F_ID,FACULTY_NAME from FACULTY where F_ID =? and FACULTY_NAME=?");
                    statement.setString(1, facId);
                    statement.setString(2, facname);
                    ResultSet result = statement.executeQuery();
                    if(result.next()){
                        //stat.executeQuery("delete from faculty where F_ID="+facId"");


                        stat.executeQuery("delete from faculty where F_ID='"+facId+"'");

                    }else{
                        session.setAttribute("wrong_fac_id", "1");          //change
                        response.sendRedirect("delete_faculty.jsp");                     //chnge
                    }
               
                
            } catch (SQLException e) {
                session.setAttribute("wrong_query", "1");           //chnge
                response.sendRedirect("delete_faculty.jsp");
            } 
            try{
            %>
                <br>
                <br>
                <center><p style="color:blueviolet;font-size: 30px">Data deleted Successfully</p></center>
                <br>
                <br>
                <br>
                <div class="btn-group">
                    <form action="delete_faculty.jsp" method="post">
                         <center><button class="button">Continue</button></center>
                    </form>
                </div>
            <%
            }catch(Exception e){

            }
           
           %>
    </body>
</html>
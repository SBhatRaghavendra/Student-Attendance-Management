<%-- 
    Document   : Calendar
    Created on : 10 Nov, 2017, 4:25:13 PM
    Author     : pc
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../assets/commonCSS/datePick.css">
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
        <script src="../JS/jQuery.js"></script>
        <script src="../JS/jQueyUI.js"></script>
        <script src="../JS/datePick.js"></script>
    </head>
    <body>
        <%
            Connection con = null;
            Date d[]=new Date[10];
            int i=0,j=0;
            int dd[]=new int[10];
            int mm[]=new int[10];
            int yy[]=new int[10];
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            try{
           	    PreparedStatement statement = con.prepareStatement("select cal_date from calendar");
           	    ResultSet result = statement.executeQuery();
           	    if(!result.next()){
                        out.println("no records");
           	    }
           	    else{
                        do{
                            d[i]=result.getDate(1);
                            dd[i]=d[i].getDate();
                            mm[i]=d[i].getMonth();
                            yy[i]=d[i].getYear()+1900;
                            i++;
           		}while(result.next());
                    }
            } catch (SQLException e) {
                session.setAttribute("wrong_query", "1");
                response.sendRedirect("admin_homepage.jsp");
            }
            %>
            <br>
            <br>
            <br>
         <center><div id="mdp-demo"></div></center>
         <form action="CalendarAdd.jsp" method="GET">
            <input type="hidden" name="dateList" id="altField">
            <br>
            <br>
            
            <div class="btn-group">
                <center><button class="button">submit</button></center>
            </div>
         </form>
        <script>
window.onload=function(){
$('#mdp-demo').multiDatesPicker({
    altField: '#altField',
    addDates: [<% while(j<i) {%>new Date(<%= yy[j]%>,<%= mm[j]%> ,<%= dd[j]%>),<% j++;}%>]
    });
    };
</script>
    </body>
 
</html>

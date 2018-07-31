<%-- 
    Document   : address
    Created on : 12 Nov, 2017, 2:03:57 PM
    Author     : pc
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String usn=null;
            String permanentAddress[]={"Mangaluru","Mysore","Bengaluru","Bellary","Hassan"};
            Connection con=null;
            int i=0;
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
           	    PreparedStatement statement = con.prepareStatement("select usn from STUDENT ");
           	    ResultSet result = statement.executeQuery();
           	    if(!result.next()){
                        out.println("no records");
           	    }
           	    else{
                        do {
                            usn=result.getString(1);
                            PreparedStatement statement1 = con.prepareStatement("insert into ADDRESS(USN,PRESENT_ADDRESS,PERMANENT_ADDRESS) values(?,?,?)");
                            statement1.setString(1,usn);
                            statement1.setString(2,"Mangaluru");
                            statement1.setString(3,permanentAddress[i]);
                            ResultSet result1=statement1.executeQuery();
                            if(!result1.next())
                            {
                                out.println("No records");
                            }
                            i++;
                            if(i==5) {
                                i=0;
                            }
                            }while(result.next());
                    }
              } catch (SQLException e) {
                    out.println("error"+e);
            }
         %>
    </body>
</html>

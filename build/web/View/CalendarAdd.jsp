<%-- 
    Document   : CalendarAdd
    Created on : 11 Nov, 2017, 10:51:59 AM
    Author     : pc
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendar Add</title>
    </head>
    <body>
        <%
            Connection con=null;
            ResultSet result=null,result2=null;
            String dateList=request.getParameter("dateList");
            SimpleDateFormat initialformatter = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat finalformatter = new SimpleDateFormat("yyyy-MM-dd");
            StringTokenizer dts = new StringTokenizer(dateList,",");
            java.sql.Date[] dateSql=new java.sql.Date[dateList.length()];
            String[] dates=new String[dateList.length()];
            int i=0,count=0;
//            try {
                 while (dts.hasMoreTokens()) { 
                    dates[i]=dts.nextToken();
                  java.util.Date date1=initialformatter.parse(dates[i]);
                  
//                    out.println(finalformatter.format(date1));
                  //  java.sql.Date dateq =java.sql.Date.valueOf(finalformatter.format(date1));
                    dateSql[i]=java.sql.Date.valueOf(finalformatter.format(date1));
//                    out.println(dateSql[i]);
                    i++;
                 }
               // out.println(i);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
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
//           	    PreparedStatement statement1 = con.prepareStatement("select cal_date from calendar");
//           	    result = statement1.executeQuery();
//           	    if(!result.next()){
//                        out.println("no records");
//           	    }
//           	    else{
                       // do{
                            //out.println(result.getDate("cal_date"));
//                            for(int j=0;j<i;j++)
//                            {
//                                SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
//                                if(f1.format(result.getDate("cal_date")).equals((f1.format(dateSql[j]))))
//                                {
//                                    count++;
//                                    out.println(count);
//                                }
//                                else {
//                                    PreparedStatement statement2 = con.prepareStatement("insert into CALENDAR(CAL_DATE) values (?)");
//                                    statement2.setDate(1,dateSql[j]);
//                                   statement2.executeQuery(); 
//                               }
                           // }
                
                
                
//                
                            Statement statement2 = con.createStatement();
                            result2=statement2.executeQuery("delete  from CALENDAR"); 
                            //out.println(countDatabase);
                            PreparedStatement statement3 = con.prepareStatement("insert into CALENDAR(CAL_DATE) values (?)");
                            for(int icounter=0;icounter<i;icounter++){
                             
                                   statement3.setDate(1,dateSql[icounter]);
                                   statement3.executeQuery();    
                            
                        }
                            session.setAttribute("date_success", "1");
                            response.sendRedirect("admin_homepage.jsp");
                            
                            
                            
                            
           //		}while(result.next());
             //       }
            } catch (SQLException e) {
               out.println("Wrong Query"+e);
            }     
            
            
            
            
        %>
    </body>
</html>

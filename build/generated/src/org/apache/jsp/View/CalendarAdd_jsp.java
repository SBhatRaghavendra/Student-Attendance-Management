package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;
import java.text.ParseException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public final class CalendarAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calendar Add</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                  
                    out.println(finalformatter.format(date1));
                  //  java.sql.Date dateq =java.sql.Date.valueOf(finalformatter.format(date1));
                    dateSql[i]=java.sql.Date.valueOf(finalformatter.format(date1));
                    out.println(dateSql[i]);
                    i++;
                 }
                out.println(i);
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
                            PreparedStatement statement2 = con.prepareStatement("select count(*) as C from CALENDAR");
                            result2=statement2.executeQuery(); 
                            if(!result.next()){
                               out.println("no records");
                            }   
                            else{
                           // int countDatabase=result.getInt("C");
                          //  out.println(countDatabase);
//                            PreparedStatement statement3 = con.prepareStatement("insert into CALENDAR(CAL_DATE) values (?)");
//                            for(int icounter=countDatabase;icounter<i;icounter++){
//                             
//                                    statement2.setDate(1,dateSql[icounter]);
//                                   statement2.executeQuery();    
//                            }
                        }
                            
                            
                            
                            
           //		}while(result.next());
             //       }
            } catch (SQLException e) {
               out.println("Wrong Query"+e);
            }     
            
            
            
            
        
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

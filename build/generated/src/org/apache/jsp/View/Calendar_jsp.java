package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/commonCSS/datePick.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\n");
      out.write("        <script src=\"../JS/jQuery.js\"></script>\n");
      out.write("        <script src=\"../JS/jQueyUI.js\"></script>\n");
      out.write("        <script src=\"../JS/datePick.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("         <center><div id=\"mdp-demo\"></div></center>\n");
      out.write("         <form action=\"CalendarAdd.jsp\" method=\"GET\">\n");
      out.write("            <input type=\"hidden\" name=\"dateList\" id=\"altField\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"btn-group\">\n");
      out.write("                <center><button class=\"button\">submit</button></center>\n");
      out.write("            </div>\n");
      out.write("         </form>\n");
      out.write("        <script>\n");
      out.write("window.onload=function(){\n");
      out.write("$('#mdp-demo').multiDatesPicker({\n");
      out.write("    altField: '#altField',\n");
      out.write("    addDates: [");
 while(j<i) {
      out.write("new Date(");
      out.print( yy[j]);
      out.write(',');
      out.print( mm[j]);
      out.write(' ');
      out.write(',');
      out.print( dd[j]);
      out.write(')');
      out.write(',');
 j++;}
      out.write("]\n");
      out.write("    });\n");
      out.write("    };\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write(" \n");
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

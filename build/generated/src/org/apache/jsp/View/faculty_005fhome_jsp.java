package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public final class faculty_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Faculty Homepage</title>\r\n");
      out.write("\t \t<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("    \tth,td {\r\n");
      out.write("    \t\tpadding: 10px;\r\n");
      out.write("    \t}\r\n");
      out.write("      input[type='radio'] {\r\n");
      out.write("        transform: scale(1.5);\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\t</head>\r\n");
      out.write("        <body id=\"top\">\r\n");
      out.write("        <script>\r\n");
      out.write("                    function preventBack(){window.history.forward();}\r\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\r\n");
      out.write("                    window.onunload=function(){null};\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

          String fid=(String)session.getAttribute("fid");
          Connection con = null;
          ResultSet result=null;
          ResultSet result1=null;
          ResultSet result2=null;
          String[] sec_id=new String[10];
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
           
            try {
                    PreparedStatement statement = con.prepareStatement(" select FACULTY_NAME,DEPT_ID,COURSE_ID,SEC_ID from FACULTY where F_ID =?");
                    statement.setString(1,fid);
                    result = statement.executeQuery();
                    if(!result.next()){
                        out.println("No name");
                    }
                    String dept_id=result.getString("dept_id");
                    do{
                        sec_id[i]=result.getString("sec_id");
                        //out.println(sec_id[i]);
                        i++;
                    }while(result.next());
                    //out.println(i);
                    result1=statement.executeQuery();
                    if(!result1.next()){
                        out.println("No faculty details");
                    }
//                    PreparedStatement statement1 = con.prepareStatement(" select COURSE_NAME from COURSE where DEPARTMENT_ID =?");
//                    statement1.setString(1, dept_id);
//                    result1 = statement1.executeQuery();
//                    if(!result1.next()){
//                        out.println("NO COURSES");
//                    }

//                    PreparedStatement statement2 = con.prepareStatement(" select SCT_NAME from SECTION where =?");
//                    statement2.setString(1, dept_id);
//                    result2 = statement2.executeQuery();
//                    if(!result2.next()){
//                        out.println("NO SECTION");
//                    }
                    }
            catch (SQLException e) {
               out.println("EXCEPTION CAUGHT:1"+e);
            }
            
            
      out.write("\r\n");
      out.write("        <h1 class=\"heading\"> Welcome Mr./Mrs.");
      out.print( result1.getString("faculty_name") );
      out.write("<img src=\"../assets/images/faculty.png\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"location.href='../login.jsp';\" style=\"background-color: #d6d6c2;\r\n");
      out.write("    \tborder: none;\r\n");
      out.write("    \tcolor: #0052cc ;\r\n");
      out.write("   \tpadding: 10px 32px;\r\n");
      out.write("    \ttext-align: center;\r\n");
      out.write("    \ttext-decoration: none;\r\n");
      out.write("    \tdisplay: inline-block;\r\n");
      out.write("    \tfont-size: 16px;\r\n");
      out.write("    \tcursor: pointer;\r\n");
      out.write("    \tborder-radius: 5px;float:right;\" >Logout</button></h1>\r\n");
      out.write("\t<script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("        <center><span style=\"color:red; font-size: 28px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></center>\r\n");
      out.write("\t<form action=\"facuty_homeRedirect.jsp\" method=\"post\">\r\n");
      out.write("             <table class=\"paddingTable\">\r\n");
      out.write("                <tr>\r\n");
      out.write("      \t\t.<td align=\"right\"><input type=\"radio\" name=\"type_Faculty_update\" value=\"update_attendance\" >update attendance</td>\r\n");
      out.write("\t\t<td align=\"left\"><input type=\"radio\" name=\"type_Faculty_update\" value=\"view_report\">view report</td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("      \t\t\t <td align=\"right\">Section :</td>\r\n");
      out.write("      \t\t\t <td align=\"left\"><select  name=\"section\" style=\"width:60px;height:30px\">\r\n");
      out.write("                         ");

                         int j=0;
                         do{   
      out.write("\r\n");
      out.write("                         <option value=\"");
      out.print( sec_id[j] );
      out.write('"');
      out.write('>');
      out.print( sec_id[j] );
      out.write("</option>\r\n");
      out.write("                         ");

                            j++;
                          }while(j<i);
      out.write("\r\n");
      out.write("                        </select></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>date</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <input type=\"date\" name=\"ddate\">\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("      \t\t\t<td colspan=\"2\"><center>\r\n");
      out.write("                             <div class=\"btn-group\">\r\n");
      out.write("                             <center><button class=\"button\">submit</button></center>\r\n");
      out.write("                              </div></center>\r\n");
      out.write("                        </td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("    \t\t</table>\r\n");
      out.write("    \t\t<br><br>\r\n");
      out.write(" \t\t\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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

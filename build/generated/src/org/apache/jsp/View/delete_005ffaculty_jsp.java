package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_005ffaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\t    <title>Delete Faculty</title>\r\n");
      out.write("\t    <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("    \t    th,td {\r\n");
      out.write("    \t\t     padding: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=top>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <script>\r\n");
      out.write("                    function preventBack(){window.history.forward();}\r\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\r\n");
      out.write("                    window.onunload=function(){null};\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                if(session.getAttribute("wrong_fac_id") != null){
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    alert(\"Please enter valid faculty name and faculty ID\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                    session.removeAttribute("wrong_fac_id");
                }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                if(session.getAttribute("wrong_query") != null){
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    alert(\"Faculty details is not present in database\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                    session.removeAttribute("wrong_query");
                }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"heading\"> Delete Faculty Record \r\n");
      out.write("            <img src=\"../assets/images/admin.jpg\" alt=\"Deleting faculty\" style=\"float:left;width:200px; height:200px\">\r\n");
      out.write("            <button onclick=\"location.href='admin_homepage.html'\"  style=\"background-color: #d6d6c2;border: none;color: #0052cc ;padding: 10px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;cursor: pointer;border-radius: 5px;float:right;\" >Back</button></h1>\r\n");
      out.write("            <script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("        <form action=\"delete_facultyValidation.jsp\" method=\"post\">\r\n");
      out.write("            <table  style=\"color:#1aa3ff;font-size:24px;padding-left: 320px\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td align=\"right\">Faculty Name :</td>\r\n");
      out.write("                    <td align=\"left\"><input type=\"text\" name=\"fname\" required /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td align=\"right\">Faculty ID :</td>\r\n");
      out.write("                    <td align=\"left\"><input type=\"text\" name=\"fid\" required/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                   \r\n");
      out.write("              <!--      <tr>\r\n");
      out.write("                    <td align=\"right\">Course :</td>\r\n");
      out.write("                    <td align=\"left\"><select name=\"course\">\r\n");
      out.write("                                     <option value=\"select\">select</option>\r\n");
      out.write("                                     </select></td>\r\n");
      out.write("                    </tr>               -->\r\n");
      out.write("            </table>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"btn-group\">\r\n");
      out.write("                <center><button class=\"button\">submit</button></center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
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

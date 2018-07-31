package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_005ffaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>UPDATE_FACULTY_DETAILS</title>\n");
      out.write("\t <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\n");
      out.write("</head>\n");
      out.write("\t<body id=top>\n");
      out.write("            <script>\n");
      out.write("                    function preventBack(){window.history.forward();}\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\n");
      out.write("                    window.onunload=function(){null};\n");
      out.write("             </script>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("        ");

          if(session.getAttribute("wrong_uname") != null){
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("                alert(\"Please enter valid Faculty Name and Faculty ID\");\n");
      out.write("        </script>\n");
      out.write("        ");

          session.removeAttribute("wrong_uname");
          }
        
      out.write("\n");
      out.write("        ");

          if(session.getAttribute("wrong_query") != null){
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("                alert(\"Please enter valid Course and section\");\n");
      out.write("        </script>\n");
      out.write("        ");

          session.removeAttribute("wrong_query");
          }
        
      out.write("\n");
      out.write("        ");

          if(session.getAttribute("data_success") != null){
        
      out.write("\n");
      out.write("        <script> \n");
      out.write("                alert(\"Data updated successfully!\");\n");
      out.write("        </script>\n");
      out.write("        ");

          session.removeAttribute("data_success");
          }
        
      out.write("\n");
      out.write("\t\t<h1 class=\"heading\">UPDATE FACULTY DETAILS<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"location.href='admin_homepage.html'\" style=\"background-color: #d6d6c2;\n");
      out.write("    border: none;\n");
      out.write("    color: #0052cc ;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    float:right;\" >Back</button></h1>\n");
      out.write("\t\t<script src=\"../JS/backButton.js\"></script>\n");
      out.write("\t\t<form action=\"updateFacultyDetails.jsp\">\n");
      out.write(" \t\t\t<table class=\"paddingTable\">\n");
      out.write("   \t\t\t\t<tr>\n");
      out.write("      \t\t\t \t<td align=\"right\">Faculty Name :</td>\n");
      out.write("                                <td align=\"left\"><input type=\"text\" name=\"fname\" style=\"width: 300px\" required></td>\n");
      out.write("    \t\t\t        </tr>\n");
      out.write("                                <tr>\n");
      out.write("      \t\t\t \t<td align=\"right\">Faculty_ID :</td>\n");
      out.write("                                <td align=\"left\"><input type=\"text\" name=\"fid\" style=\"width: 300px\" required></td>\n");
      out.write("    \t\t\t        </tr>\n");
      out.write("    \t</table>\n");
      out.write("                    <br><br><br>\n");
      out.write(" \t\t\t<div class=\"btn-group\">\n");
      out.write("                            <center><button class=\"button\">submit</button></center>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("  \t</body>\n");
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

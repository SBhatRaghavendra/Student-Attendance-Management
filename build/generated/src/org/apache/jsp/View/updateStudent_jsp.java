package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>UPDATE_STUDENT_DETAILS</title>\r\n");
      out.write("\t <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\t<body id=top>\r\n");
      out.write("            <script>\r\n");
      out.write("                    function preventBack(){window.history.forward();}\r\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\r\n");
      out.write("                    window.onunload=function(){null};\r\n");
      out.write("             </script>\r\n");
      out.write("        ");

          if(session.getAttribute("wrong_uname") != null){
        
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                alert(\"Please enter valid Student Name and USN\");\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

          session.removeAttribute("wrong_uname");
          }
        
      out.write("\r\n");
      out.write("        ");

          if(session.getAttribute("data_success") != null){
        
      out.write("\r\n");
      out.write("        <script> \r\n");
      out.write("                alert(\"Data updated successfully!\");\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

          session.removeAttribute("data_success");
          }
        
      out.write("\r\n");
      out.write("\t\t<h1 class=\"heading\">UPDATE STUDENT DETAILS<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"location.href='admin_homepage.jsp'\" style=\"background-color: #d6d6c2;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: #0052cc ;\r\n");
      out.write("    padding: 10px 32px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    float:right;\" >Back</button></h1>\r\n");
      out.write("\t\t<script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("\t\t<form action=\"updateStudentDetails.jsp\">\r\n");
      out.write(" \t\t\t<table class=\"paddingTable\">\r\n");
      out.write("   \t\t\t\t<tr>\r\n");
      out.write("      \t\t\t \t<td align=\"right\">Student Name :</td>\r\n");
      out.write("                                <td align=\"left\"><input type=\"text\" name=\"fname\" style=\"width: 300px\" required></td>\r\n");
      out.write("    \t\t\t        </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("      \t\t\t \t<td align=\"right\">Student USN :</td>\r\n");
      out.write("                                <td align=\"left\"><input type=\"text\" name=\"usn\" style=\"width: 300px\" required></td>\r\n");
      out.write("    \t\t\t        </tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write(" \t\t\t<div class=\"btn-group\">\r\n");
      out.write("                            <center><button class=\"button\">submit</button></center>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("  \t</body>\r\n");
      out.write("</html>\r\n");
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

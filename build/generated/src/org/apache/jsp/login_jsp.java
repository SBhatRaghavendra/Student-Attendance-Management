package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/commonCSS/styleCommon.css\">\n");
      out.write("                <style>\n");
      out.write("\t\t\t\tbody, html {\n");
      out.write("\t    \t\t\theight: 100%;\n");
      out.write("\t    \t\t\tmargin: 0;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t.bg {\n");
      out.write("\t    \t\t\tbackground-image: url(\"assets/images/college.jpg\");\n");
      out.write("\t    \t\t\theight: 100%;\n");
      out.write("\t    \t\t\tbackground-position: center;\n");
      out.write("\t    \t\t\tbackground-repeat: no-repeat;\n");
      out.write("\t    \t\t\tbackground-size: cover;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tinput[type='radio'] {\n");
      out.write("\t    \t\t\ttransform: scale(1.5);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\ttable {\n");
      out.write("\t    \t\t\twidth: auto;\n");
      out.write("\t    \t\t\tmargin-left: auto;\n");
      out.write("\t    \t\t\tmargin-right: auto;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tdiv.transbox {\n");
      out.write("\t \t\t\t\tmargin: 30px;\n");
      out.write("\t  \t\t\t\tbackground-color: #ffffff;\n");
      out.write("\t  \t\t\t\tborder: 1px solid black;\n");
      out.write("\t  \t\t\t\topacity: 0.9;\n");
      out.write("\t  \t\t\t\tfilter: alpha(opacity=60); /* For IE8 and earlier */\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t</style>\n");
      out.write("\t    </head>\n");
      out.write("\t    <body>\n");
      out.write("                <script>\n");
      out.write("                    function preventBack(){window.history.forward();}\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\n");
      out.write("                    window.onunload=function(){null};\n");
      out.write("                </script>\n");
      out.write("                ");

                if(session.getAttribute("wrong_uname_pass") != null){
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Please enter valid user name and password\");\n");
      out.write("                </script>\n");
      out.write("                ");

                    session.removeAttribute("wrong_uname_pass");
                }
                
      out.write("\n");
      out.write("\t    \t<div class=\"bg\">\n");
      out.write("\t    \t<marquee behavior=\"scroll\" direction=\"left\"><h1 style=\"font-size: 38px;text-align: center;color: #0b3fc1\">WELCOME TO STUDENT ATTENDANCE MANAGEMENT</h1></marquee>\n");
      out.write("\t\t\t<h2 style=\"font-size: 34px; text-align: center;\">LOGIN</h2>\n");
      out.write("\t\t\t<div class=\"transbox\">\n");
      out.write("                            <center><span style=\"color:red; font-size: 28px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></center>\n");
      out.write("\t        <form name=\"myForm\" action=\"loginValidation.jsp\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"loginForm\">\n");
      out.write("\t\t\t\t<table class=\"paddingTable\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Admin: </td>\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"radio\" name=\"type_login\" value=\"admin\" ></td>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Faculty: </td>\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"radio\" name=\"type_login\" value=\"faculty\"></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Username: </td>\n");
      out.write("                                                <td align=\"left\"><input type=\"text\" name=\"name\" required></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">Password: </td>\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"password\" name=\"pass\" required></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<br><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t                <center><button class=\"button\">login</button></center>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                    \n");
      out.write("\t        </form><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
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

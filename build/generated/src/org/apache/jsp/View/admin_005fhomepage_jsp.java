package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fhomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>ADMIN HOMEPAGE</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\tul {\n");
      out.write("  \t\t\ttext-align: left;\n");
      out.write("  \t\t\tdisplay: inline;\n");
      out.write("  \t\t\tmargin: 0;\n");
      out.write("  \t\t\tpadding:0;\n");
      out.write("  \t\t\tlist-style: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\tul li {\n");
      out.write("  \t\t\tfont: 18px sans-serif;\n");
      out.write("  \t\t\tdisplay: inline-block;\n");
      out.write("  \t\t\tmargin-right: -4px;\n");
      out.write(" \t\t \tposition: relative;\n");
      out.write("  \t\t\tpadding: 15px 20px;\n");
      out.write("  \t\t\tbackground: #ffba31;\n");
      out.write("  \t\t\tcursor: pointer;\n");
      out.write("  \t\t\t-webkit-transition: all 0.2s;\n");
      out.write("  \t\t\t-moz-transition: all 0.2s;\n");
      out.write("  \t\t\t-ms-transition: all 0.2s;\n");
      out.write("  \t\t\t-o-transition: all 0.2s;\n");
      out.write("  \t\t\ttransition: all 0.2s;\n");
      out.write("  \t\t\tcolor: #fff;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li:hover {\n");
      out.write("  \t\t\tbackground: #f7a740;\n");
      out.write("  \t\t\tcolor: #fff;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li ul {\n");
      out.write("  \t\t\tpadding: 0;\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\ttop: 48px;\n");
      out.write("  \t\t\tleft: 0;\n");
      out.write("  \t\t\twidth: 150px;\n");
      out.write("  \t\t\t-webkit-box-shadow: none;\n");
      out.write("  \t\t\t-moz-box-shadow: none;\n");
      out.write("  \t\t\tbox-shadow: none;\n");
      out.write("  \t\t\tdisplay: none;\n");
      out.write("  \t\t\topacity: 0;\n");
      out.write("  \t\t\tvisibility: hidden;\n");
      out.write("  \t\t\t-webkit-transiton: opacity 0.2s;\n");
      out.write("  \t\t\t-moz-transition: opacity 0.2s;\n");
      out.write("  \t\t\t-ms-transition: opacity 0.2s;\n");
      out.write("  \t\t\t-o-transition: opacity 0.2s;\n");
      out.write("  \t\t\t-transition: opacity 0.2s;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li ul li {\n");
      out.write("  \t\t\twidth: 180px;\n");
      out.write("  \t\t\tbackground-color: #ffba31;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li ul li > a { \n");
      out.write("  \t\t\ttext-decoration: none;\n");
      out.write("  \t\t\tdisplay: block; \n");
      out.write("  \t\t\tcolor: #fff;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li ul li:hover {\n");
      out.write("    \t\tbackground: #666;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li:hover ul {\n");
      out.write("  \t\t\tdisplay: block;\n");
      out.write("  \t\t\topacity: 1;\n");
      out.write("  \t\t\tvisibility: visible;\n");
      out.write("\t\t}\n");
      out.write("\t\tul li > span {\n");
      out.write("    \t\tdisplay: inline-block;\n");
      out.write("    \t\tmargin: 0 0 -1px 15px;\n");
      out.write("    \t\twidth: 12px;\n");
      out.write("    \t\theight: 12px;\n");
      out.write("    \t\tbackground-image: url('../assets/images/arrow_down.png');\n");
      out.write("    \t\tbackground-size: 12px 12px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:black\">\n");
      out.write("        ");

          if(session.getAttribute("date_success") != null){
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("                alert(\"Calendar updated sucessfully\");\n");
      out.write("        </script>\n");
      out.write("        ");

          session.removeAttribute("date_success");
          }
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("                    function preventBack(){window.history.forward();}\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\n");
      out.write("                    window.onunload=function(){null;};\n");
      out.write("        </script>\n");
      out.write("\t<h1 class=\"heading\">WELCOME ADMIN<button onclick=\"location.href='../login.jsp';\" style=\"background-color: #d6d6c2;\n");
      out.write("            border: none;\n");
      out.write("            color: #0052cc ;\n");
      out.write("            padding: 10px 32px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 5px;float:right;\" >Logout</button></h1>\n");
      out.write("\t<ul>\n");
      out.write("  \t\t<li>\n");
      out.write("    \t\tFACULTY<span class=\"arrow-down\"></span>\n");
      out.write("    \t\t<ul>\n");
      out.write("      \t\t\t<li><a href=\"addFaculty.jsp\">Add Faculty</a></li>\n");
      out.write("      \t\t\t<li><a href=\"delete_faculty.jsp\">Delete Faculty</a></li>\n");
      out.write("      \t\t\t<li><a href=\"update_faculty.jsp\">Update Faculty Details</a></li>\n");
      out.write("    \t\t</ul>\n");
      out.write("  \t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<ul>\n");
      out.write("  \t\t<li>\n");
      out.write("    \t\tSTUDENT<span class=\"arrow-down\"></span>\n");
      out.write("    \t\t<ul>\n");
      out.write("      \t\t\t\n");
      out.write("      \t\t\t<li><a href=\"addStudent.jsp\">Add Student</a></li>\n");
      out.write("      \t\t\t<li><a href=\"delete_student.jsp\">Delete Student</a></li>\n");
      out.write("      \t\t\t<li><a href=\"updateStudent.jsp\">Update Student Details</a></li>\n");
      out.write("    \t\t</ul>\n");
      out.write("  \t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<ul>\n");
      out.write("  \t\t<li>\n");
      out.write("    \t\tCALENDAR<span class=\"arrow-down\"></span>\n");
      out.write("    \t\t<ul>\n");
      out.write("      \t\t\t<li><a href=\"Calendar.jsp\">View/Update Calendar</a></li>\n");
      out.write("    \t\t</ul>\n");
      out.write("  \t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>\n");
      out.write("    \t\tREPORT<span class=\"arrow-down\"></span>\n");
      out.write("    \t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"View_report\">VIEW ATTENDANCE REPORT</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li style=\"color: #ffba31\">........................................................................................................................................... </li>\n");
      out.write("\t</ul>\n");
      out.write("\t<br><br><br>\n");
      out.write("\t<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"padding-left: 500px;\n");
      out.write("\tpadding-top: 50px;width:280px; height:280px\">\n");
      out.write("</body>\n");
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

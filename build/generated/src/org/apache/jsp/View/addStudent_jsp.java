package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("  <title></title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    fieldset {\r\n");
      out.write("      border:2px solid green;\r\n");
      out.write("  padding: 1em;\r\n");
      out.write("  font:80%/1 sans-serif;\r\n");
      out.write("  }\r\n");
      out.write("label {\r\n");
      out.write("  float:left;\r\n");
      out.write("  width:25%;\r\n");
      out.write("  margin-right:.5em;\r\n");
      out.write("  padding-top:.7em;\r\n");
      out.write("  text-align:right;\r\n");
      out.write("  font-weight:bold;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  legend {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"heading\"> Add Student <img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"goBack()\" style=\"background-color: #d6d6c2;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: #0052cc ;\r\n");
      out.write("    padding: 10px 32px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    border-radius: 5px;float:right;\" >Back</button></h1>\r\n");
      out.write("    <script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("    <center><span style=\"color:red; font-size: 28px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></center>\r\n");
      out.write("    <form action=\"addStudentValidation.jsp\" method=\"post\">\r\n");
      out.write("  <fieldset id=\"places\">\r\n");
      out.write("  <legend>Add Student</legend>\r\n");
      out.write("    <label for=\"FNAME\">FirstName:</label>\r\n");
      out.write("    <input type=\"text\" name=\"FNAME\" id=\"name\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"MNAME\">MiddleName:</label>\r\n");
      out.write("    <input type=\"text\" name=\"MNAME\" id=\"name\">\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"LNAME\">LastName:</label>\r\n");
      out.write("    <input type=\"text\" name=\"LNAME\" id=\"name\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"USN\">USN:</label>\r\n");
      out.write("    <input type=\"text\" name=\"USN\" id=\"usn\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"Gender\">GENDER:</label>\r\n");
      out.write("    <input type=\"radio\" name=\"type_addStudent\" value=\"male\" >male\r\n");
      out.write("    <input type=\"radio\" name=\"type_addStudent\" value=\"female\">female\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label>Department:</label>\r\n");
      out.write("    <select name=\"DEPARTMENT\">\r\n");
      out.write("                     <option value=\"Computer_Science_and_Engineering\">Computer Science</option>\r\n");
      out.write("                      <option value=\"Mechanical_Engineering\">Mechanical</option>\r\n");
      out.write("                     <option value=\"Electronics_and_Communication_Engineering\">Electronics And Communication</option>\r\n");
      out.write("                     <option value=\"Eleectricals_and_Electronics_Engineering\">Eleectricals And Electronics</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"Present_Address\">Present_Address:</label>\r\n");
      out.write("    <input type=\"text\" name=\"Present_Address\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"Permanent_Address\">Permanent_Address:</label>\r\n");
      out.write("    <input type=\"text\" name=\"Permanent_Address\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"SECTION_ID\">SECTION_ID:</label>\r\n");
      out.write("    <input type=\"text\" name=\"SECTION_ID\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"CONTACT_NO\">CONTACT_NO:</label>\r\n");
      out.write("    <input type=\"text\" name=\"CONTACT_NO\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"Email\">EMAIL_ID:</label>\r\n");
      out.write("    <input type=\"text\" name=\"EMAIL_ID\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"PARENT_NAME\">PARENT_NAME:</label>\r\n");
      out.write("    <input type=\"text\" name=\"PARENT_NAME\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"btn-group\">\r\n");
      out.write("    <center><button class=\"button\">submit</button></center>\r\n");
      out.write("    </div>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
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

package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addFaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("places=[ ['',['select','Computer_Science_and_Engineering', 'Mechanical_Engineering', 'Electronics_and_Communication_Engineering','Electronics_and_Electicals_Engineering']],\r\n");
      out.write("  ['Computer_Science_and_Engineering', ['select','cs1','cs3','cs5','cs7']],\r\n");
      out.write("    ['cs1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING PHYSICS','ELEMENTS OF MECHANICAL ENGINEERING']],\r\n");
      out.write("    ['cs3', ['select','Analog and Digital Electronics', 'Engineering Mathematics-3', 'Data Structures and Applications']],\r\n");
      out.write("    ['cs5', ['select','Management and Entrepreneurship for IT Industry', 'Computer Networks ', 'Database Management System ']],\r\n");
      out.write("    ['cs7',['select','WEB TECHNOLOGY AND ITS APPLICATION','ADVANCED COMPUTER ARCHITECTURE ','NATURAL LANGUAGE PROCESSING ']],\r\n");
      out.write("  ['Mechanical_Engineering', ['select','me1', 'me3','me5','me7']],\r\n");
      out.write("    ['me1', ['select','select','ENGINEERING MATHEMATICS-1','ENGINEERING PHYSICS','ELEMENTS OF MECHANICAL ENGINEERING']],\r\n");
      out.write("    ['me3', ['select','Engineering Mathematics-3', 'Materials Science ', 'Mechanics of Materials']],\r\n");
      out.write("    ['me5', ['select','Dynamics of Machinery', 'Turbo Machines', 'Design of Machine Elements - I']],\r\n");
      out.write("    ['me7', ['select','Mechanical Vibrations', 'Hydraulics And Pneumatics', 'Theory of Plasticity']],\r\n");
      out.write("  ['Electronics_and_Communication_Engineering', ['select','ec1','ec3','ec5','ec7']],\r\n");
      out.write("    ['ec1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING CHEMISTRY','PROGRAMMING IN C AND DATA STRUCTURES']],\r\n");
      out.write("    ['ec3', ['select','Electronic Instrumentation ', 'Engineering Mathematics-3', 'Engineering Electromagnetics ']],\r\n");
      out.write("    ['ec5', ['select','Digital Signal Processing', 'Verilog HDL', 'Analog Electronics']],\r\n");
      out.write("    ['ec7', ['select','Microwave and Antennas', 'Digital Image Processing', 'Power Electronics']],\r\n");
      out.write("  ['Electronics_and_Electicals_Engineering', ['select','eee1','eee3','eee5','eee7']],\r\n");
      out.write("    ['eee1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING CHEMISTRY','PROGRAMMING IN C AND DATA STRUCTURES']],\r\n");
      out.write("    ['eee3', ['select','Electric Circuit Analysis', 'Engineering Mathematics-3', 'Transformers and Generators']],\r\n");
      out.write("    ['eee5', ['select','MICROCONTROLLER', 'POWER ELECTRICALS', 'SIGNALS AND SYSTEMS']],\r\n");
      out.write("    ['eee7', ['select','POWER SYSTEM PROTECTION', 'HIGH VOLTAGE ENGINEERING', 'UTILIZATION OF ELECTRICAL POWER']]\r\n");
      out.write("];\r\n");
      out.write("\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("  boxes = document.getElementById('places').getElementsByTagName('select');\r\n");
      out.write("  boxes_len = boxes.length; \r\n");
      out.write("  our_array = places;\r\n");
      out.write("  arr_len = our_array.length;\r\n");
      out.write("  fillEm(0);\r\n");
      out.write("    for (i=0; i<boxes_len-1; i++) {\r\n");
      out.write("    boxes[i].onchange=function() {\r\n");
      out.write("      for (m=0; m<boxes_len-1; m++) {\r\n");
      out.write("      if (this==boxes[m]) {\r\n");
      out.write("      fillEm(m+1);\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function fillEm(no) {\r\n");
      out.write("  for (j=no; j<boxes_len; j++) {\r\n");
      out.write("    if (j==0) {\r\n");
      out.write("    the_options = our_array[0][1];\r\n");
      out.write("    addOptions(the_options, boxes[j]);\r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write("    pVal = boxes[j-1].value;\r\n");
      out.write("      for (k = 0; k<arr_len; k++) {\r\n");
      out.write("      if (our_array[k][0] == pVal) {\r\n");
      out.write("      the_options = our_array[k][1];\r\n");
      out.write("      addOptions(the_options, boxes[j]);\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function addOptions(the_options, the_sel) {\r\n");
      out.write("  len = the_options.length;\r\n");
      out.write("  while (the_sel.hasChildNodes()) {\r\n");
      out.write("    the_sel.removeChild(the_sel.firstChild);\r\n");
      out.write("  }\r\n");
      out.write("  for (i=0; i<len; i++) {\r\n");
      out.write("    op = document.createElement(\"option\");\r\n");
      out.write("    the_val = the_options[i];\r\n");
      out.write("    val = document.createAttribute('value');\r\n");
      out.write("    val.value = the_val; \r\n");
      out.write("    op.setAttributeNode(val);\r\n");
      out.write("    the_text = document.createTextNode(the_val);\r\n");
      out.write("    op.appendChild(the_text);\r\n");
      out.write("    if (i==0) {\r\n");
      out.write("    op.selected=true;\r\n");
      out.write("    }\r\n");
      out.write("    the_sel.appendChild(op);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("                ");

                if(session.getAttribute("wrong_pass") != null){
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    alert(\"Password and Confirm Password do not match!\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                    session.removeAttribute("wrong_pass");
                }
                
      out.write("\r\n");
      out.write("                ");

                if(session.getAttribute("wrong_query") != null){
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    alert(\"Entered Faculty ID isalready present\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                    session.removeAttribute("wrong_query");
                }
                
      out.write("\r\n");
      out.write("                ");

                if(session.getAttribute("wrong_details") != null){
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    alert(\"please enter fields correctly\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                    session.removeAttribute("wrong_details");
                }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"heading\"> Add Faculty <img src=\"../assets/images/faculty.png\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"goBack()\" style=\"background-color: #d6d6c2;\r\n");
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
      out.write("<form action=\"addFacultyValidation.jsp\" method=\"post\">\r\n");
      out.write("  <fieldset id=\"places\">\r\n");
      out.write("  <legend>Add faculty</legend>\r\n");
      out.write("    <label for=\"name\">Name:</label>\r\n");
      out.write("    <input type=\"text\" name=\"name\" id=\"name\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"Faculty_id\">Faculty id:</label>\r\n");
      out.write("    <input type=\"text\" name=\"Faculty_id\" id=\"Faculty_id\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"Gender\">Gender:</label>\r\n");
      out.write("    <input type=\"radio\" name=\"type_addFaculty\" value=\"male\" >male\r\n");
      out.write("    <input type=\"radio\" name=\"type_addFaculty\" value=\"female\">female\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("    <label for=\"contactNo\">Contact No:</label>\r\n");
      out.write("    <input type=\"text\" name=\"contactNo\" required>\r\n");
      out.write("    <pre><br></pre>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <label for=\"department\">Department:</label>\r\n");
      out.write("<select id=\"dept\" name=\"dept\"></select>\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<label for=\"semester\">Semester:</label>\r\n");
      out.write("<select id=\"sem1\" name=\"sem1\" required></select>\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<label for=\"course\">Course:</label>\r\n");
      out.write("<select id=\"course1\" name=\"course1\" required></select>\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<label for=\"section\">Section:</label>\r\n");
      out.write("<select id=\"section1\" name=\"section1\" required>\r\n");
      out.write("\t<option value=\"a\">a</option>\r\n");
      out.write("\t<option value=\"b\">b</option>\r\n");
      out.write("</select>\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<label for=\"password\">Password:</label>\r\n");
      out.write("<input type=\"text\" name=\"password\">\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<label for=\"confirm_password\">Confirm Password:</label>\r\n");
      out.write("<input type=\"text\" name=\"confirm_password\" required>\r\n");
      out.write("<pre><br></pre>\r\n");
      out.write("<div class=\"btn-group\">\r\n");
      out.write("    <center><button class=\"button\">submit</button></center>\r\n");
      out.write("</div>\r\n");
      out.write("</fieldset>\r\n");
      out.write("</form>\r\n");
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

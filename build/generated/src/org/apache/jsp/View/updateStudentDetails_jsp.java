package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class updateStudentDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Update Student Details</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\"> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"top\">\r\n");
      out.write("             ");

          if(session.getAttribute("wrong_query") != null){
        
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                alert(\"Please enter valid Details\");\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

          session.removeAttribute("wrong_query");
          }
        
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                    function preventBack(){window.history.forward();}\r\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\r\n");
      out.write("                    window.onunload=function(){null};\r\n");
      out.write("            </script>\r\n");
      out.write("            ");

            String fname=request.getParameter("fname");
            String usn= request.getParameter("usn");
            session.setAttribute("susn",usn);
            Connection con = null;
            ResultSet result=null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            PreparedStatement stat=null;
            try {
                stat=con.prepareStatement("select * from student where USN=?");
                stat.setString(1,usn);
                result=stat.executeQuery();
                 
            }
            catch (SQLException e) {
                 out.println("SQLException caught:4S ");
            }
           boolean rs=result.next();
           if(!rs)
           {
               session.setAttribute("wrong_uname", "1");
               response.sendRedirect("updateStudent.jsp");
           }
           String mname=null;
          if(rs){
            if(result.getString("MNAME").equals(null))
            {
                mname="";
            }
            else
            {
                mname=result.getString("MNAME");
            }
            
      out.write("\r\n");
      out.write("            <h1 class=\"heading\">UPDATE STUDENT DETAILS<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"goBack()\" style=\"background-color: #d6d6c2;\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: #0052cc ;\r\n");
      out.write("                padding: 10px 32px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                float:right;\" >Back</button></h1>\r\n");
      out.write("\t\t<script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("            <form action=\"updatedStudent.jsp\" method=\"POST\">\r\n");
      out.write("              <table border = \"1\" width = \"50%\" align=\"center\"  style=\"color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>FNAME:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"fname\" value=\"");
      out.print( result.getString("FNAME") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>MNAME:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"mname\" value=\"");
      out.print(mname);
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>LNAME:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"lname\" value=\"");
      out.print( result.getString("LNAME") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>USN:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"usn\" value=\"");
      out.print( result.getString("USN") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    <td>GENDER:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"gender\" value=\"");
      out.print( result.getString("GENDER") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Dept_ID:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"dept_id\" value=\"");
      out.print( result.getString("DEPT_ID") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Section_id:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"section_id\" value=\"");
      out.print( result.getString("section_id") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Contact_No.:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"contact_no\" value=\"");
      out.print( result.getString("CONTACT_NO") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Email_id:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"email_id\" value=\"");
      out.print( result.getString("EMAIL_ID") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>PARENT NAME:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"parent_name\" value=\"");
      out.print( result.getString("parent_name") );
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table\r\n");
      out.write("                <BR><br>\r\n");
      out.write("                \r\n");
      out.write("                <br><br><br>\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                     <center><button class=\"button\">Update</button></center>\r\n");
      out.write("\t        </div>\r\n");
      out.write("          </form>\r\n");
      out.write("                <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("             <center><button onclick=\"location.href='SubjectDetails.jsp'\" style=\"background-color: #d6d6c2;\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: #0052cc ;\r\n");
      out.write("                padding: 10px 32px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                border-radius: 5px;\" >Subject Details</button></center>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("         \r\n");
      out.write("    </body>\r\n");
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

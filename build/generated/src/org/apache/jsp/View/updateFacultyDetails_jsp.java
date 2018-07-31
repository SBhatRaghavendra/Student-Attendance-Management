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

public final class updateFacultyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Faculty Details</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("            <script>\n");
      out.write("                    function preventBack(){window.history.forward();}\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\n");
      out.write("                    window.onunload=function(){null};\n");
      out.write("            </script>\n");
      out.write("            ");

            String fname=request.getParameter("fname");
            String fid= request.getParameter("fid");
            session.setAttribute("cookieValue",fname);
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
                stat=con.prepareStatement("select * from faculty where faculty_name=? and F_ID=?");
                stat.setString(1,fname);
                stat.setString(2,fid);
                result=stat.executeQuery();
            }
            catch (SQLException e) {
                 out.println("SQLException caught:4S ");
            }
           boolean rs=result.next();
           if(!rs)
           {
               session.setAttribute("wrong_uname", "1");
               response.sendRedirect("update_faculty.jsp");
           }
          if(rs){
      out.write("\n");
      out.write("            <h1 class=\"heading\">UPDATE FACULTY DETAILS<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"goBack()\" style=\"background-color: #d6d6c2;\n");
      out.write("                border: none;\n");
      out.write("                color: #0052cc ;\n");
      out.write("                padding: 10px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                float:right;\" >Back</button></h1>\n");
      out.write("\t\t<script src=\"../JS/backButton.js\"></script>\n");
      out.write("            <form action=\"updatedFaculty.jsp\" method=\"POST\">\n");
      out.write("              <table border = \"1\" width = \"50%\" align=\"center\"  style=\"color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Faculty Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"faculty_name\" value=\"");
      out.print( result.getString("FACULTY_NAME") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Faculty ID:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"f_id\" value=\"");
      out.print( result.getString("F_ID") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\" value=\"");
      out.print( result.getString("PASSWORD") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Dept ID:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"dept_id\" value=\"");
      out.print( result.getString("DEPT_ID") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact No.:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"contact_no\" value=\"");
      out.print( result.getString("CONTACT_NO") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"gender\" value=\"");
      out.print( result.getString("GENDER") );
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("                 <button onclick=\"location.href='addSubjects.jsp'\" style=\"background-color: #d6d6c2;\n");
      out.write("                border: none;\n");
      out.write("                color: #0052cc ;\n");
      out.write("                padding: 10px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                float:right;\" >Subject Details</button>\n");
      out.write("                <br><br><br>\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                     <center><button class=\"button\">Update</button></center>\n");
      out.write("\t        </div>\n");
      out.write("          </form>\n");
      out.write("             \n");
      out.write("            ");
}
      out.write("\n");
      out.write("         \n");
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

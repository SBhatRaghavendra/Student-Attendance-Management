package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

public final class updatedFaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Updated Faculty Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("               function preventBack(){window.history.forward();}\n");
      out.write("               setTimeout(\"preventBack()\", 0);\n");
      out.write("               window.onunload=function(){null};\n");
      out.write("        </script>\n");
      out.write("        ");

            String faculty_name=request.getParameter("faculty_name");
            String fid=request.getParameter("f_id");
            String password=request.getParameter("password");
            String dept_id=request.getParameter("dept_id");
            String contact_no=request.getParameter("contact_no");
            String gender=request.getParameter("gender");
            Connection con = null;
            ResultSet result=null;
            
            try {
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught:1 ");
            }
            catch (SQLException e) {
                out.println("SQLException caught:2 ");
            }
            //out.println("connected");
            PreparedStatement stat=null;
            String cvalue=(String)session.getAttribute("FID");         
            try {
                stat=con.prepareStatement("update faculty set FACULTY_NAME=?,F_ID=?,password=?,dept_id=?,contact_no=?,gender=? where F_ID='"+cvalue+"'");
                stat.setString(1, faculty_name);
                stat.setString(2, fid);
                stat.setString(3, password);
                stat.setString(4,dept_id);
                stat.setString(5,contact_no);
                stat.setString(6,gender);
                int i=stat.executeUpdate();
                session.setAttribute("data_success", "1");
               response.sendRedirect("update_faculty.jsp");
                //con.close();
                //stat.close();
                
            } catch (SQLException e) {
                 session.setAttribute("wrong_query", "1");
                 response.sendRedirect("updateFacultyDetails.jsp");
                out.println("ERror"+e);
            }
            
         
      out.write("   \n");
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

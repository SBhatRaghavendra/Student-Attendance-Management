package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class loginValidation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String fname=request.getParameter("name");
            String password= request.getParameter("pass");
            Connection con = null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            String radioSelection;
           try {
                 radioSelection= request.getParameter("type_login");
                 if(radioSelection.equals("admin")) {
                    PreparedStatement statement = con.prepareStatement("select ADMIN_ID,ADMIN_PASSWORD from admin where  ADMIN_ID =? and ADMIN_PASSWORD=?");
                    statement.setString(1, fname);
                    statement.setString(2, password);
                    ResultSet result = statement.executeQuery();
                    if(result.next()){
                        response.sendRedirect("View/admin_homepage.html");
                    }else{
                        session.setAttribute("wrong_uname_pass", "1");
                        response.sendRedirect("login.jsp");
                    }
                }
                else if(radioSelection.equals("faculty")) {
                    PreparedStatement statement = con.prepareStatement("select F_ID,PASSWORD from faculty where  F_ID =? and PASSWORD=?");
                    statement.setString(1, fname);
                    statement.setString(2, password);
                    ResultSet result = statement.executeQuery();
                    if(result.next()){
                        response.sendRedirect("View/faculty_home.html");
                    }else{
                        session.setAttribute("wrong_uname_pass", "1");
                        response.sendRedirect("login.jsp");
                    }
                }
                
             }
            catch(NullPointerException e)
           {
               request.setAttribute("errMsg", "Please select the type of user");
               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
               rd.forward(request, response);
           } 
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            
      out.write("\n");
      out.write("    </body>\n");
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

package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class update_005fattendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Add Student Validation</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            input[type=radio] {\r\n");
      out.write("                border: 0px;\r\n");
      out.write("                width: 100%; \r\n");
      out.write("                height: 1.5em;\r\n");
      out.write("            }\r\n");
      out.write("            label {\r\n");
      out.write("                float:left;\r\n");
      out.write("                width:25%;\r\n");
      out.write("                margin-right:.5em;\r\n");
      out.write("                text-align:right;\r\n");
      out.write("                font-weight:bold;\r\n");
      out.write("                color: #1aa3ff;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("            }\r\n");
      out.write("         </style>\r\n");
      out.write("    </head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("        <script>\r\n");
      out.write("                    function preventBack(){window.history.forward();}\r\n");
      out.write("                    setTimeout(\"preventBack()\", 0);\r\n");
      out.write("                    window.onunload=function(){null};\r\n");
      out.write("        </script>\r\n");

    String section=(String)session.getAttribute("section");
    String fid=(String)session.getAttribute("fid");
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.util.Date utilDate = cal.getTime();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    java.sql.Date sqlDate = new Date(utilDate.getTime());
		Connection con = null;
		try {
                
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
			}
		catch (ClassNotFoundException e) {
			out.println("SQLException caught: " +e.getMessage());
		}
		catch (SQLException e) {
			out.println("SQLException caught: " +e.getMessage());
		}
		try{
		PreparedStatement statement1 = con.prepareStatement("select COURSE_ID from FACULTY where SEC_ID=? and F_ID=?");
                statement1.setString(1,section);
                statement1.setString(2,fid);
                ResultSet result1 = statement1.executeQuery();              //check section student table
                if(!result1.next()){
                        out.println("no records");
                }
                PreparedStatement statement = con.prepareStatement("select FNAME,USN from STUDENT where section_id=?");
                statement.setString(1,section);
                ResultSet result = statement.executeQuery();
                if(!result.next()){
                        out.println("no records");
                }
                else{
                    String usn=result.getString("USN");
                    session.setAttribute("susn",usn);
            
      out.write("\r\n");
      out.write("            <h1 class=\"heading\"> Attendance Sheet<button onclick=\"location.href='faculty_home.jsp';\" style=\"background-color: #d6d6c2;\r\n");
      out.write("                                                  border: none;\r\n");
      out.write("                                                  color: #0052cc ;\r\n");
      out.write("                                                  padding: 10px 32px;\r\n");
      out.write("                                                  text-align: center;\r\n");
      out.write("                                                  text-decoration: none;\r\n");
      out.write("                                                  display: inline-block;\r\n");
      out.write("                                                  font-size: 16px;\r\n");
      out.write("                                                  cursor: pointer;\r\n");
      out.write("                                                  border-radius: 5px;\r\n");
      out.write("                                                  float:right;\" >Back</button>\r\n");
      out.write("                                                  <script src=\"../JS/backButton.js\"></script>\r\n");
      out.write("            </h1>\r\n");
      out.write("\t\t\t<form action=\"updateAttendanceValidation.jsp\" method=\"post\">\r\n");
      out.write("                <label style=\"float: left\">Course: </label>\r\n");
      out.write("                <select name=\"course\">\r\n");
      out.write("                ");
  do{  
                   String temp=result1.getString("COURSE_ID");
                
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(temp);
      out.write('"');
      out.write('>');
      out.print(temp);
      out.write("</option>\r\n");
      out.write("                ");
 }while(result1.next());  
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                <label>Date: </label>\r\n");
      out.write("                <input style=\"float:right\" type=\"text\" name=\"date\" value=\"");
      out.print(sqlDate);
      out.write("\" readonly/> \r\n");
      out.write("                <table style=\"border:2px solid white;color:#1aa3ff; font-size:24px; width: 100%\">\r\n");
      out.write("                 \r\n");
      out.write("             <tr>\r\n");
      out.write("                <th rowspan=\"2\" align=\"center\">Name</th>\r\n");
      out.write("                <th rowspan=\"2\" align=\"center\">USN</th>\r\n");
      out.write("                <th colspan=\"2\" align=\"center\">Attendance</th>\r\n");
      out.write("                   \r\n");
      out.write("             </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("                 <td align=\"center\">present</td>\r\n");
      out.write("                <td align=\"center\">absent</td>\r\n");
      out.write("             </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

                int j=0;
                do{
                
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td align=\"center\">\r\n");
      out.write("                   <input type=\"text\" name=\"fname\" value=\"");
      out.print( result.getString("FNAME"));
      out.write("\" readonly />\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                    <td align=\"center\">\r\n");
      out.write("                   <input type=\"text\" name=\"usn");
      out.print(j);
      out.write("\" value=\"");
      out.print( result.getString("USN") );
      out.write("\" readonly />\r\n");
      out.write("                    </td>\r\n");
      out.write("                <td align=\"center\"><input type=\"radio\" name=\"p");
      out.print( j );
      out.write("\" value=\"present\" checked /></td>\r\n");
      out.write("                <td align=\"center\"><input type=\"radio\" name=\"p");
      out.print( j );
      out.write("\" value=\"absent\"></td>\r\n");
      out.write("                </tr>");
 j++;}while(result.next());  
                
                session.setAttribute("countJ",Integer.toString(j));
                
                
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                <BR>\r\n");
      out.write("                <BR>\r\n");
      out.write("                <BR>\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                    <center><button class=\"button\">submit</button></center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                ");
  }  
      out.write("   \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("               ");
 }
              catch (SQLException e) {
              out.println("error"+e);       //comment
                // session.setAttribute("wrong_query", "1");
                //response.sendRedirect("addStudent.jsp"); 
              } 

        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>      \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
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

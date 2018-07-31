package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public final class SubjectDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>update faculty</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <h1 class=\"heading\">UPDATE FACULTY DETAILS<img src=\"../assets/images/admin.jpg\" alt=\"Welcome\" style=\"float:left;width:200px; height:200px\"><button onclick=\"location.href='updateFacultyDetails.jsp'\" style=\"background-color: #d6d6c2;\n");
      out.write("    border: none;\n");
      out.write("    color: #0052cc ;\n");
      out.write("    padding: 10px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    float:right;\" >Back</button></h1>\n");
      out.write("        <script src=\"../JS/backButton.js\"></script>\n");
      out.write("        ");

           String fid=(String)session.getAttribute("facultyId");
          session.removeAttribute("facultyId");
            int count=0;     
            Connection con = null;
            try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("Exception caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            
           try {
                
                PreparedStatement statement = con.prepareStatement("select FACULTY_NAME,COURSE_ID,SEC_ID from FACULTY where F_ID=?");
		statement.setString(1,fid);
                ResultSet result = statement.executeQuery();
                if(!result.next())
                {
                	out.println("No records");
                }
                else{
                String facName=result.getString("FACULTY_NAME");
                
      out.write("\n");
      out.write("                <table border = \"1\" width = \"50%\" align=\"center\"  style=\"color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px\">\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Name </td>\n");
      out.write("                    <td>");
      out.print(facName);
      out.write("</td>\n");
      out.write("                 </tr>\n");
      out.write("               ");
 do{
                	String courseID=result.getString("COURSE_ID");
                	String sectionID=result.getString("SEC_ID");
                        count=count+1;
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Course ID </td>\n");
      out.write("                                <td>");
      out.print(courseID );
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                                <td>Section ID </td>\n");
      out.write("                                <td>");
      out.print(sectionID);
      out.write("</td>\n");
      out.write("                                    \n");
      out.write("                            </tr>\n");
      out.write("                \n");
      out.write("               ");
 }while(result.next()); 
      out.write("\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("               ");

                }
           }
           
           catch(SQLException e){
               
                  
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 5"+e);
           }
           
           
           if(count==1){
               session.setAttribute("FacultyID",fid);
               
      out.write("\n");
      out.write("               <br>\n");
      out.write("               \n");
      out.write("                <center><button onclick=\"location.href='SubjectAddDetails.jsp'\" style=\"background-color: #d6d6c2;\n");
      out.write("                border: none;\n");
      out.write("                color: #0052cc ;\n");
      out.write("                padding: 10px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\" >Add Subject Details</button></center>\n");
      out.write("             ");
 }
            
      out.write("\n");
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

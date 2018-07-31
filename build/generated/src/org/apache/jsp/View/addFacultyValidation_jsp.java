package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class addFacultyValidation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Add Faculty Validation</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/commonCSS/styleCommon.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");


            ArrayList<String> al=new ArrayList<String>();
            al.add("Computer_Science_and_Engineering");//Adding object in arraylist  
            al.add("Mechanical_Engineering");  
            al.add("Electronics_and_Communication_Engineering");  
            al.add("Electronics_and_Electicals_Engineering");  
            String fname=request.getParameter("name");
            String Faculty_id= request.getParameter("Faculty_id");
            String contactNo=request.getParameter("contactNo");
            String dept= request.getParameter("dept"); 
            String sem1=request.getParameter("sem1");
            String course1=request.getParameter("course1");
            String password= request.getParameter("password");
            String confirm_password= request.getParameter("confirm_password");
            String section1=request.getParameter("section1");

            
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
            String gender=null;
           String radioSelection;
           try {
                 radioSelection= request.getParameter("type_addFaculty");
                 if(radioSelection.equals("male")) {
                    gender="male";
                    
                }
                else if(radioSelection.equals("female")) {
                     gender="female";
                   
                }
                
             }
            catch(NullPointerException e)
           {
               request.setAttribute("errMsg", "Please select the gender");
               RequestDispatcher rd = request.getRequestDispatcher("addFaculty.jsp");
               rd.forward(request, response);
           }
           if(!password.equals(confirm_password))
                {
                    session.setAttribute("wrong_pass", "1");
                    response.sendRedirect("addFaculty.jsp");
                }
           else{
           try {
                Statement stat=con.createStatement();
                //out.println(course1);
                PreparedStatement statement = con.prepareStatement("select course_id from course where course_name=?");
		statement.setString(1,course1);
                ResultSet result1 = statement.executeQuery();
                if(!result1.next())
                {
                	out.println("No records");
                }
                out.println("records");
                String actual_courseid=null;
                do{
                	String str=result1.getString(1);
                	if(str.length()==4){
                		if(sem1.equals(str.substring(0,3)))    // 0,2 check
                			actual_courseid=str;
                    }
                    if(str.length()==5){
        				if(sem1.equals(str.substring(0,4)))
        					actual_courseid=str;
               }
                    
                //out.println("records11");
                }while(result1.next());
                int sec_number=0;
                char semester='0';
                int dept_index=(al.indexOf(dept)+1);
                if(sem1.length()==3){
                		semester=sem1.charAt(2);
                                
                   //out.println("     semester"+sem1.charAt(2));    
          		 }
          		 else if(sem1.length()==4){
                		semester=sem1.charAt(3);
                                //out.println("     semester"+sem1.charAt(3)); 
          		 }
          		if(section1.equals("a"))
          			sec_number=1;
          		if(section1.equals("b"))
          			sec_number=2;	
          		String actual_deptno=Integer.toString(dept_index);
                   //out.println("     semester"+semester);    
                //out.println("     actual_deptno"+actual_deptno);
          		String Ssection=Integer.toString(dept_index)+semester+Integer.toString(sec_number);
               
                //out.println("    Ssection"+Ssection);
                        
                        stat.executeQuery("insert into FACULTY(F_ID,FACULTY_NAME,PASSWORD,DEPT_ID,COURSE_ID,CONTACT_NO,GENDER,SEC_ID) values('"+Faculty_id+"','"+fname+"','"+password+"','"+actual_deptno+"','"+actual_courseid+"','"+contactNo+"','"+gender+"','"+Ssection+"')");
            } catch (SQLException e) {
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 5"+e);
            } 

           


            try{
            
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <center><p style=\"color:blueviolet;font-size: 30px\">Data Entered Successfully</p></center>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <form action=\"addFaculty.jsp\" method=\"post\">\r\n");
      out.write("                         <center><button class=\"button\">Continue</button></center>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            ");

            }catch(Exception e){

            }
           }
           
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

<%-- 
    Document   : addSubject
    Created on : 6 Nov, 2017, 11:49:52 AM
    Author     : pc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update faculty</title>
         <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
    <body id="top">
        <h1 class="heading">UPDATE FACULTY DETAILS<img src="../assets/images/admin.jpg" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="goBack()" style="background-color: #d6d6c2;
    border: none;
    color: #0052cc ;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;
    float:right;" >Back</button></h1>
        <script src="../JS/backButton.js"></script>
        <%
          String fid=(String)session.getAttribute("facultyId");
          out.println(fid);
          //session.removeAttribute("facultyId");
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
                %>
                <table border = "1" width = "50%" align="center"  style="color: #0561fc;font-size:24px;border-color: #fcfbf9;padding: 20px">
                 <tr>
                    <td>Name </td>
                    <td><%=facName%></td>
                 </tr>
               <% do{
                	String courseID=result.getString("COURSE_ID");
                	String sectionID=result.getString("SEC_ID");
                        count=count+1;
                        %>
                        
                            <tr>
                                <td>Course ID </td>
                                <td><%=courseID %></td>
                            
                                <td>Section ID </td>
                                <td><%=sectionID%></td>
                                    
                            </tr>
                
               <% }while(result.next()); %>
                
                </table>
               <%
                }
           }
           
           catch(SQLException e){
               
                  
               // session.setAttribute("wrong_query", "1");
               // response.sendRedirect("addFaculty.jsp");
               out.println("sql excep 5"+e);
           }
           
           
           if(count==1){
               session.setAttribute("FacultyID",fid);
               %>
               <br>
               
                <center><button onclick="location.href='SubjectAddDetails.jsp'" style="background-color: #d6d6c2;
                border: none;
                color: #0052cc ;
                padding: 10px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                cursor: pointer;
                border-radius: 5px;" >Add Subject Details </button></center>
             <% }
            %>
</body>
</html>

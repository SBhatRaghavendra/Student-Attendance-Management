<%-- 
    Document   : SubjectAddDetails
    Created on : 6 Nov, 2017, 5:17:37 PM
    Author     : pc
--%>
<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add subject</title>
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
   
  <body id="top">
       <h1 class="heading"> Add Subject <img src="../assets/images/faculty.png" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="goBack()" style="background-color: #d6d6c2;
    border: none;
    color: #0052cc ;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;float:right;" >Back</button></h1>
    <%
    String fid=(String)session.getAttribute("FacultyID");// check prev page
    session.removeAttribute("FacultyID");
    
    //out.println(fid);
    
    String deptid=null,courseid=null,fname=null,deptName=null,gender=null,contact=null,password=null;
    Connection con = null;
    ResultSet result=null,result1=null,result2=null,result3;
    result3=null;
           
     try {
                
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","RAGHAVENDRA","raghavendra");
            } catch (ClassNotFoundException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
            catch (SQLException e) {
                out.println("SQLException caught: " +e.getMessage());
            }
      try {
                 PreparedStatement statement = con.prepareStatement("select FACULTY_NAME,DEPT_ID from FACULTY where F_ID=?");
		statement.setString(1,fid);
                result = statement.executeQuery();
                
                if(!result.next())
                {
                	out.println("No records");
                }
                // error message to be added
                 fname=result.getString("FACULTY_NAME");
                 deptid=result.getString("DEPT_ID");
                 
                 session.setAttribute("deptId",deptid );

                PreparedStatement statement1 = con.prepareStatement("select DPT_NAME from DEPARTMENT where DPT_ID=?");
		statement1.setString(1,deptid);
                result1 = statement1.executeQuery();
                if(!result1.next())
                {
                	out.println("No records");
                }
                // error message to be added
                deptName=result1.getString("DPT_NAME");
               
                 
//                  //CHECK DEPT FEILD IN DATABASE 
//
                PreparedStatement statement2 = con.prepareStatement("select COURSE_NAME from COURSE where DEPARTMENT_ID=?");
	        statement2.setString(1,deptid); 
                result2 = statement2.executeQuery();
                if(!result2.next())
                {
                	out.println("No records");
                }
                // error message to be added
               
                 PreparedStatement statement3 = con.prepareStatement("select SCT_NAME from SECTION  where DPT_ID=?");
		            statement3.setString(1,deptid); 
                result3 = statement3.executeQuery();
                if(!result3.next())
                {
                	out.println("No records");
                }
                // error message to be added
            }
            catch (SQLException e) {
                 out.println("SQLException caught: "+e);
            }
         
     
    %>
     <form action="addFacSubValid.jsp" method="post">
    <table class="paddingTable">
      <tr>
        <td>Name</td>
        <td><input type="text" name="name" value="<%=fname%>" readonly></td>
      </tr>
      <tr>
          <td>Faculty ID</td>
          <td><input type="text" name="Faculty_id" value="<%=fid%>" readonly=""></td>
          
      </tr>
      <tr>
          <td>department</td>
          <td><input type="text" style="width:300px" name="deptId" value="<%=deptName%>" readonly=""></td>
      </tr>
<!--      <tr>
          <td>Semester</td>
          <td>
              <select name="sem">
                  <option value="1">1</option>
                  <option value="3">3</option>
                  <option value="5">5</option>                  
                  <option value="7">7</option>
              </select>
                  
          </td>
      </tr>
-->
      <tr>
          <td>course</td>
             <td>
                 <select name="course">
                     
                     <%
                     do{
                     String course_temp=result2.getString("COURSE_NAME");%>
                     <option value="<%=course_temp%>"><%=course_temp%></option>
                    <% }
                     while(result2.next());
                     %>
                 </select>
             </td>
      </tr>
      <tr>
          <td>Section</td>
          <td>
              <select name="sec">
                  <option value="a">a</option>
                  <option value="b">b</option>
              </select>
                  
          </td>
      </tr>
    </table>
                 <div class="btn-group">
                            <center><button class="button">submit</button></center>
		</div>
    </form>
  </body>
</html>
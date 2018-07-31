<%-- 
    Document   : updated
    Created on : Nov 11, 2017, 11:32:59 PM
    Author     : pc
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
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
        <title>Add Student Validation</title>
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
        <style>
            input[type=radio] {
                border: 0px;
                width: 100%; 
                height: 1.5em;
            }
         </style>
    </head>
<body id="top">
        <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null};
        </script>
<%
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
            %>
            <h1 class="heading"> Attendance Sheet<button onclick="location.href='faculty_home.jsp';" style="background-color: #d6d6c2;
                                                  border: none;
                                                  color: #0052cc ;
                                                  padding: 10px 32px;
                                                  text-align: center;
                                                  text-decoration: none;
                                                  display: inline-block;
                                                  font-size: 16px;
                                                  cursor: pointer;
                                                  border-radius: 5px;
                                                  float:right;" >Back</button>
                                                  <script src="../JS/backButton.js"></script>
            </h1>
			<form action="updateAttendanceValidation.jsp" method="post">
                <p style="color: #1aa3ff;font-size: 24px;">Course:
                <select name="course">
                <%  do{  
                   String temp=result1.getString("COURSE_ID");
                %>
                <option value="<%=temp%>"><%=temp%></option>
                <% }while(result1.next());  %>
                </select>
                </p>
                <p style="color: #1aa3ff;font-size: 24px;">  Date:
                <input type="text" name="date" value="<%=sqlDate%>" readonly/>
                </p>
                <table style="border:2px solid white;color:#1aa3ff; font-size:24px; width: 100%">
                 
             <tr>
                <th rowspan="2" align="center">Name</th>
                <th rowspan="2" align="center">USN</th>
                <th colspan="2" align="center">Attendance</th>
                   
             </tr>
             <tr>
                 <td align="center">present</td>
                <td align="center">absent</td>
             </tr>


            <%
                int j=0;
                do{
                %>
                    <tr>
                    <td align="center">
                   <input type="text" name="fname" value="<%= result.getString("FNAME")%>" readonly />
                    </td>

                    <td align="center">
                   <input type="text" name="usn<%=j%>" value="<%= result.getString("USN") %>" readonly />
                    </td>
                <td align="center"><input type="radio" name="p<%= j %>" value="present" checked /></td>
                <td align="center"><input type="radio" name="p<%= j %>" value="absent"></td>
                </tr><% j++;}while(result.next());  
                
                session.setAttribute("countJ",Integer.toString(j));
                
                %>
                </table>
                <BR>
                <BR>
                <BR>
                    <div class="btn-group">
                    <center><button class="button">submit</button></center>
                    </div>
                </form>
                <%  }  %>   
                
                
                
               <% }
              catch (SQLException e) {
              out.println("error"+e);       //comment
                // session.setAttribute("wrong_query", "1");
                //response.sendRedirect("addStudent.jsp"); 
              } 

        %>
    </body>
</html>      		
		
		
		

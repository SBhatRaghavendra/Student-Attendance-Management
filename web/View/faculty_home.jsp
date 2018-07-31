<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Faculty Homepage</title>
	 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    <style>
    	th,td {
    		padding: 10px;
    	}
      input[type='radio'] {
        transform: scale(1.5);
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
                if(session.getAttribute("dataSuccess1") != null){
                %>
                <script>
                    alert("Attendance updated successfully!");
                </script>
                <%
                    session.removeAttribute("dataSuccess1");
                }
                %>
                <%
	if((session.getAttribute("statusfail"))!=null){
        %>
           <script>
                  alert("Today is a holiday!");
           </script>
       <%
         session.removeAttribute("statusfail");
         
       }
       %>
        <%
          String fid=(String)session.getAttribute("fid");
          Connection con = null;
          ResultSet result=null;
          ResultSet result1=null;
          ResultSet result2=null;
          String[] sec_id=new String[10];
          int i=0;
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
                    PreparedStatement statement = con.prepareStatement(" select FACULTY_NAME,DEPT_ID,COURSE_ID,SEC_ID from FACULTY where F_ID =?");
                    statement.setString(1,fid);
                    result = statement.executeQuery();
                    if(!result.next()){
                        out.println("No name");
                    }
                    String dept_id=result.getString("dept_id");
                    do{
                        sec_id[i]=result.getString("sec_id");
                        //out.println(sec_id[i]);
                        i++;
                    }while(result.next());
                    //out.println(i);
                    result1=statement.executeQuery();
                    if(!result1.next()){
                        out.println("No faculty details");
                    }
//                    PreparedStatement statement1 = con.prepareStatement(" select COURSE_NAME from COURSE where DEPARTMENT_ID =?");
//                    statement1.setString(1, dept_id);
//                    result1 = statement1.executeQuery();
//                    if(!result1.next()){
//                        out.println("NO COURSES");
//                    }

//                    PreparedStatement statement2 = con.prepareStatement(" select SCT_NAME from SECTION where =?");
//                    statement2.setString(1, dept_id);
//                    result2 = statement2.executeQuery();
//                    if(!result2.next()){
//                        out.println("NO SECTION");
//                    }
                    }
            catch (SQLException e) {
               out.println("EXCEPTION CAUGHT:1"+e);
            }
            
            %>
        <h1 class="heading"> Welcome Mr./Mrs.<%= result1.getString("faculty_name") %><img src="../assets/images/faculty.png" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="location.href='../login.jsp';" style="background-color: #d6d6c2;
    	border: none;
    	color: #0052cc ;
   	padding: 10px 32px;
    	text-align: center;
    	text-decoration: none;
    	display: inline-block;
    	font-size: 16px;
    	cursor: pointer;
    	border-radius: 5px;float:right;" >Logout</button></h1>
	<script src="../JS/backButton.js"></script>
        <center><span style="color:red; font-size: 28px">${errMsg}</span></center>
	<form action="facuty_homeRedirect.jsp" method="post">
             <table class="paddingTable">
                <tr>
      		.<td align="right"><input type="radio" name="type_Faculty_update" value="update_attendance" >update attendance</td>
		<td align="left"><input type="radio" name="type_Faculty_update" value="view_report">view report</td>
    		</tr>

		<tr>
      			 <td align="right">Section :</td>
      			 <td align="left"><select  name="section" style="width:60px;height:30px">
                         <%
                         int j=0;
                         do{   %>
                         <option value="<%= sec_id[j] %>"><%= sec_id[j] %></option>
                         <%
                            j++;
                          }while(j<i);%>
                        </select></td>
    		</tr>
          
                 <tr>
      			<td colspan="2"><center>
                             <div class="btn-group">
                             <center><button class="button">submit</button></center>
                              </div></center>
                        </td>
                 </tr>
    		</table>
    		<br><br>
 		
		</form>	

	</body>
</html>
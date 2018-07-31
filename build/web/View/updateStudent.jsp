<%-- 
    Document   : update_faculty
    Created on : 1 Nov, 2017, 11:32:24 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>UPDATE_STUDENT_DETAILS</title>
	 <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
</head>
	<body id=top>
            <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null};
             </script>
        <%
          if(session.getAttribute("wrong_uname") != null){
        %>
        <script>
                alert("Please enter valid Student Name and USN");
        </script>
        <%
          session.removeAttribute("wrong_uname");
          }
        %>
        <%
          if(session.getAttribute("data_success") != null){
        %>
        <script> 
                alert("Data updated successfully!");
        </script>
        <%
          session.removeAttribute("data_success");
          }
        %>
		<h1 class="heading">UPDATE STUDENT DETAILS<img src="../assets/images/admin.jpg" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="location.href='admin_homepage.jsp'" style="background-color: #d6d6c2;
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
		<form action="updateStudentDetails.jsp">
 			<table class="paddingTable">
   				<tr>
      			 	<td align="right">Student Name :</td>
                                <td align="left"><input type="text" name="fname" style="width: 300px" required></td>
    			        </tr>
                                <tr>
      			 	<td align="right">Student USN :</td>
                                <td align="left"><input type="text" name="usn" style="width: 300px" required></td>
    			        </tr>
    	</table>
                    <br><br><br>
 			<div class="btn-group">
                            <center><button class="button">submit</button></center>
			</div>
		</form>
  	</body>
</html>

<%-- 
    Document   : admin_homepage.jsp
    Created on : 11 Nov, 2017, 6:58:19 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>ADMIN HOMEPAGE</title>
	<link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
	<style type="text/css">
		ul {
  			text-align: left;
  			display: inline;
  			margin: 0;
  			padding:0;
  			list-style: none;
			}
		ul li {
  			font: 18px sans-serif;
  			display: inline-block;
  			margin-right: -4px;
 		 	position: relative;
  			padding: 15px 20px;
  			background: #ffba31;
  			cursor: pointer;
  			-webkit-transition: all 0.2s;
  			-moz-transition: all 0.2s;
  			-ms-transition: all 0.2s;
  			-o-transition: all 0.2s;
  			transition: all 0.2s;
  			color: #fff;
		}
		ul li:hover {
  			background: #f7a740;
  			color: #fff;
		}
		ul li ul {
  			padding: 0;
  			position: absolute;
  			top: 48px;
  			left: 0;
  			width: 150px;
  			-webkit-box-shadow: none;
  			-moz-box-shadow: none;
  			box-shadow: none;
  			display: none;
  			opacity: 0;
  			visibility: hidden;
  			-webkit-transiton: opacity 0.2s;
  			-moz-transition: opacity 0.2s;
  			-ms-transition: opacity 0.2s;
  			-o-transition: opacity 0.2s;
  			-transition: opacity 0.2s;
		}
		ul li ul li {
  			width: 180px;
  			background-color: #ffba31;
		}
		ul li ul li > a { 
  			text-decoration: none;
  			display: block; 
  			color: #fff;
		}
		ul li ul li:hover {
    		background: #666;
		}
		ul li:hover ul {
  			display: block;
  			opacity: 1;
  			visibility: visible;
		}
		ul li > span {
    		display: inline-block;
    		margin: 0 0 -1px 15px;
    		width: 12px;
    		height: 12px;
    		background-image: url('../assets/images/arrow_down.png');
    		background-size: 12px 12px;
		}
	</style>
</head>
<body style="background-color:black">
        <%
          if(session.getAttribute("date_success") != null){
        %>
        <script>
                alert("Calendar updated sucessfully");
        </script>
        <%
          session.removeAttribute("date_success");
          }
        %>
        <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null;};
        </script>
	<h1 class="heading">WELCOME ADMIN<button onclick="location.href='../login.jsp';" style="background-color: #d6d6c2;
            border: none;
            color: #0052cc ;
            padding: 10px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;float:right;" >Logout</button></h1>
	<ul>
  		<li>
    		FACULTY<span class="arrow-down"></span>
    		<ul>
      			<li><a href="addFaculty.jsp">Add Faculty</a></li>
      			<li><a href="delete_faculty.jsp">Delete Faculty</a></li>
      			<li><a href="update_faculty.jsp">Update Faculty Details</a></li>
    		</ul>
  		</li>
	</ul>
	<ul>
  		<li>
    		STUDENT<span class="arrow-down"></span>
    		<ul>
      			
      			<li><a href="addStudent.jsp">Add Student</a></li>
      			<li><a href="delete_student.jsp">Delete Student</a></li>
      			<li><a href="updateStudent.jsp">Update Student Details</a></li>
    		</ul>
  		</li>
	</ul>
	<ul>
  		<li>
    		CALENDAR<span class="arrow-down"></span>
    		<ul>
      			<li><a href="Calendar.jsp">View/Update Calendar</a></li>
    		</ul>
  		</li>
	</ul>
	<ul>
		<li>
    		REPORT<span class="arrow-down"></span>
    		<ul>
				<li><a href="View_report">VIEW ATTENDANCE REPORT</a></li>
			</ul>
		</li>
	</ul>
	<ul>
		<li style="color: #ffba31">........................................................................................................................................... </li>
	</ul>
	<br><br><br>
	<img src="../assets/images/admin.jpg" alt="Welcome" style="padding-left: 500px;
	padding-top: 50px;width:280px; height:280px">
</body>
</html>

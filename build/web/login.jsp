<%-- 
    Document   : login
    Created on : 27 Oct, 2017, 9:26:21 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="assets/commonCSS/styleCommon.css">
                <style>
				body, html {
	    			height: 100%;
	    			margin: 0;
				}
				.bg {
	    			background-image: url("assets/images/college.jpg");
	    			height: 100%;
	    			background-position: center;
	    			background-repeat: no-repeat;
	    			background-size: cover;
				}
				input[type='radio'] {
	    			transform: scale(1.5);
				}
				table {
	    			width: auto;
	    			margin-left: auto;
	    			margin-right: auto;
				}
				div.transbox {
	 				margin: 30px;
	  				background-color: #ffffff;
	  				border: 1px solid black;
	  				opacity: 0.9;
	  				filter: alpha(opacity=60); /* For IE8 and earlier */
				}
			</style>
	    </head>
	    <body>
                <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null};
                </script>
                <%
                if(session.getAttribute("wrong_uname_pass") != null){
                %>
                <script>
                    alert("Please enter valid user name and password");
                </script>
                <%
                    session.removeAttribute("wrong_uname_pass");
                }
                %>
	    	<div class="bg">
	    	<marquee behavior="scroll" direction="left"><h1 style="font-size: 38px;text-align: center;color: #0b3fc1">WELCOME TO STUDENT ATTENDANCE MANAGEMENT</h1></marquee>
			<h2 style="font-size: 34px; text-align: center;">LOGIN</h2>
			<div class="transbox">
                            <center><span style="color:red; font-size: 28px">${errMsg}</span></center>
	        <form name="myForm" action="loginValidation.jsp" method="post">
			<div class="loginForm">
				<table class="paddingTable">
					<tr>
						<td align="right">Admin: </td>
						<td align="left"><input type="radio" name="type_login" value="admin" ></td>
						<td align="right">Faculty: </td>
						<td align="left"><input type="radio" name="type_login" value="faculty"></td>
					</tr>
					<tr>
						<td align="right">Username: </td>
                                                <td align="left"><input type="text" name="name" required></td>
					</tr>
					<tr>
						<td align="right">Password: </td>
						<td align="left"><input type="password" name="pass" required></td>
					</tr>
				</table>
				<br><br>
			</div>
				<div class="btn-group">
	                <center><button class="button">login</button></center>
				</div>
                    
	        </form><br>
			</div>
			</div>
    </body>
</html>

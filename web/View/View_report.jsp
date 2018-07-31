<!DOCTYPE html>
<html>
<head>
	<title>VIEW REPORT</title>
	 <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
</head>
	<body id=top>
		<h1 class="heading">REPORT<img src="../assets/images/faculty.png" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="goBack()" style="background-color: #d6d6c2;
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
		<form action="updateFacultyDetails.jsp"><br><br>
 			<table class="paddingTable">
   				<tr>
      			 	<td align="right">Name :</td>
      			 	<td align="left"><input type="text" name="fname" /></td>
    			</tr>
					<tr>
      			 	<td align="right">USN :</td>
      			 	<td align="left"><input type="text" name="fid" /></td>
    			</tr>
    	</table>
    	<br><br>
 			<div class="btn-group">
                <center><button class="button">submit</button></center>
			</div>
		</form>
  	</body>
</html>
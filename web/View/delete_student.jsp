<!DOCTYPE html>
<html>
    <head>
	    <title>Delete Student</title>
	    <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
        <style>
    	    th,td {
    		     padding: 10px;
            }
        </style>
    </head>
    <body id=top>


         <script>
                    function preventBack(){window.history.forward();}
                    setTimeout("preventBack()", 0);
                    window.onunload=function(){null};
                </script>
                <%
                if(session.getAttribute("usn") != null){
                %>
                <script>
                    alert("Please enter valid Student name and usn");
                </script>
                <%
                    session.removeAttribute("wrong_usn");
                }
                %>

                <%
                if(session.getAttribute("wrong_query") != null){
                %>
                <script>
                    alert("Student details is not present in database");
                </script>
                <%
                    session.removeAttribute("wrong_query");
                }
                %>


        <h1 class="heading"> Delete Student Record 
            <img src="../assets/images/admin.jpg" alt="Deleting Student" style="float:left;width:200px; height:200px">
            <button onclick="goBack()" style="background-color: #d6d6c2;border: none;color: #0052cc ;padding: 10px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;cursor: pointer;border-radius: 5px;float:right;" >Back</button></h1>
            <script src="../JS/backButton.js"></script>
        <form action="delete_studentValidation.jsp" method="post">
            <table  style="color:#1aa3ff;font-size:24px;padding-left: 320px">
                    <tr>
                    <td align="right">Name :</td>
                    <td align="left"><input type="text" name="fname" required /></td>
                    </tr>
                    <tr>
                    <td align="right">usn:</td>
                    <td align="left"><input type="text" name="usn" required/></td>
                    </tr>
                   
              <!--      <tr>
                    <td align="right">Course :</td>
                    <td align="left"><select name="course">
                                     <option value="select">select</option>
                                     </select></td>
                    </tr>               -->
            </table>
            <br><br>
            <div class="btn-group">
                <center><button class="button">submit</button></center>
            </div>
        </form>
    </body>
</html>
<!DOCTYPE html>
<html>
    <head>
	    <title>Delete Faculty</title>
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
                if(session.getAttribute("wrong_fac_id") != null){
                %>
                <script>
                    alert("Please enter valid faculty name and faculty ID");
                </script>
                <%
                    session.removeAttribute("wrong_fac_id");
                }
                %>

                <%
                if(session.getAttribute("wrong_query") != null){
                %>
                <script>
                    alert("Faculty details is not present in database");
                </script>
                <%
                    session.removeAttribute("wrong_query");
                }
                %>


        <h1 class="heading"> Delete Faculty Record 
            <img src="../assets/images/admin.jpg" alt="Deleting faculty" style="float:left;width:200px; height:200px">
            <button onclick="location.href='admin_homepage.jsp'"  style="background-color: #d6d6c2;border: none;color: #0052cc ;padding: 10px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;cursor: pointer;border-radius: 5px;float:right;" >Back</button></h1>
            <script src="../JS/backButton.js"></script>
        <form action="delete_facultyValidation.jsp" method="post">
            <table  style="color:#1aa3ff;font-size:24px;padding-left: 320px">
                    <tr>
                    <td align="right">Faculty Name :</td>
                    <td align="left"><input type="text" name="fname" required /></td>
                    </tr>
                    <tr>
                    <td align="right">Faculty ID :</td>
                    <td align="left"><input type="text" name="fid" required/></td>
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
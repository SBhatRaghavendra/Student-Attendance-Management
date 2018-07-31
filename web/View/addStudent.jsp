<!DOCTYPE html>
<html>
<head>
  <title></title>
  <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
  <style type="text/css">
    
    fieldset {
      border:2px solid green;
  padding: 1em;
  font:80%/1 sans-serif;
  }
label {
  float:left;
  width:25%;
  margin-right:.5em;
  padding-top:.7em;
  text-align:right;
  font-weight:bold;
  }

  legend {
    font-size: 24px;
  }

  </style>
</head>
<body>

<h1 class="heading"> Add Student <img src="../assets/images/admin.jpg" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="goBack()" style="background-color: #d6d6c2;
    border: none;
    color: #0052cc ;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;float:right;" >Back</button></h1>
    <script src="../JS/backButton.js"></script>
    <center><span style="color:red; font-size: 28px">${errMsg}</span></center>
    <form action="addStudentValidation.jsp" method="post">
  <fieldset id="places">
  <legend>Add Student</legend>
    <label for="FNAME">FirstName:</label>
    <input type="text" name="FNAME" id="name" required>
    <pre><br></pre>
    <label for="MNAME">MiddleName:</label>
    <input type="text" name="MNAME" id="name">
    <pre><br></pre>
    <label for="LNAME">LastName:</label>
    <input type="text" name="LNAME" id="name" required>
    <pre><br></pre>
    <label for="USN">USN:</label>
    <input type="text" name="USN" id="usn" required>
    <pre><br></pre>
    <label for="Gender">GENDER:</label>
    <input type="radio" name="type_addStudent" value="male" >male
    <input type="radio" name="type_addStudent" value="female">female
    <pre><br></pre>
    <label>Department:</label>
    <select name="DEPARTMENT">
                     <option value="Computer_Science_and_Engineering">Computer Science</option>
                      <option value="Mechanical_Engineering">Mechanical</option>
                     <option value="Electronics_and_Communication_Engineering">Electronics And Communication</option>
                     <option value="Eleectricals_and_Electronics_Engineering">Eleectricals And Electronics</option>
                     </select>
    <pre><br></pre>
    <label for="Present_Address">Present_Address:</label>
    <input type="text" name="Present_Address" required>
    <pre><br></pre>
    <pre><br></pre>
    <label for="Permanent_Address">Permanent_Address:</label>
    <input type="text" name="Permanent_Address" required>
    <pre><br></pre>
    <label for="SECTION_ID">SECTION_ID:</label>
    <input type="text" name="SECTION_ID" required>
    <pre><br></pre>
    <label for="CONTACT_NO">CONTACT_NO:</label>
    <input type="text" name="CONTACT_NO" required>
    <pre><br></pre>
    <label for="Email">EMAIL_ID:</label>
    <input type="text" name="EMAIL_ID" required>
    <pre><br></pre>
    <label for="PARENT_NAME">PARENT_NAME:</label>
    <input type="text" name="PARENT_NAME" required>
    <pre><br></pre>
    
    <div class="btn-group">
    <center><button class="button">submit</button></center>
    </div>
    </fieldset>
    </form>
</body>
</html>
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
  <script type="text/javascript">
places=[ ['',['select','Computer_Science_and_Engineering', 'Mechanical_Engineering', 'Electronics_and_Communication_Engineering','Electronics_and_Electicals_Engineering']],
  ['Computer_Science_and_Engineering', ['select','cs1','cs3','cs5','cs7']],
    ['cs1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING PHYSICS','ELEMENTS OF MECHANICAL ENGINEERING']],
    ['cs3', ['select','Analog and Digital Electronics', 'Engineering Mathematics-3', 'Data Structures and Applications']],
    ['cs5', ['select','Management and Entrepreneurship for IT Industry', 'Computer Networks ', 'Database Management System']],
    ['cs7',['select','WEB TECHNOLOGY AND ITS APPLICATION','ADVANCED COMPUTER ARCHITECTURE','NATURAL LANGUAGE PROCESSING']],
  ['Mechanical_Engineering', ['select','me1', 'me3','me5','me7']],
    ['me1', ['select','select','ENGINEERING MATHEMATICS-1','ENGINEERING PHYSICS','ELEMENTS OF MECHANICAL ENGINEERING']],
    ['me3', ['select','Engineering Mathematics-3', 'Materials Science', 'Mechanics of Materials']],
    ['me5', ['select','Dynamics of Machinery', 'Turbo Machines', 'Design of Machine Elements - I']],
    ['me7', ['select','Mechanical Vibrations', 'Hydraulics And Pneumatics', 'Theory of Plasticity']],
  ['Electronics_and_Communication_Engineering', ['select','ec1','ec3','ec5','ec7']],
    ['ec1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING CHEMISTRY','PROGRAMMING IN C AND DATA STRUCTURES']],
    ['ec3', ['select','Electronic Instrumentation', 'Engineering Mathematics-3', 'Engineering Electromagnetics']],
    ['ec5', ['select','Digital Signal Processing', 'Verilog HDL', 'Analog Electronics']],
    ['ec7', ['select','Microwave and Antennas', 'Digital Image Processing', 'Power Electronics']],
  ['Electronics_and_Electicals_Engineering', ['select','eee1','eee3','eee5','eee7']],
    ['eee1', ['select','ENGINEERING MATHEMATICS-1','ENGINEERING CHEMISTRY','PROGRAMMING IN C AND DATA STRUCTURES']],
    ['eee3', ['select','Electric Circuit Analysis', 'Engineering Mathematics-3', 'Transformers and Generators']],
    ['eee5', ['select','MICROCONTROLLER', 'POWER ELECTRICALS', 'SIGNALS AND SYSTEMS']],
    ['eee7', ['select','POWER SYSTEM PROTECTION', 'HIGH VOLTAGE ENGINEERING', 'UTILIZATION OF ELECTRICAL POWER']]
];

window.onload = function() {
  boxes = document.getElementById('places').getElementsByTagName('select');
  boxes_len = boxes.length; 
  our_array = places;
  arr_len = our_array.length;
  fillEm(0);
    for (i=0; i<boxes_len-1; i++) {
    boxes[i].onchange=function() {
      for (m=0; m<boxes_len-1; m++) {
      if (this==boxes[m]) {
      fillEm(m+1);
      }
    }
    }
  }
} 

function fillEm(no) {
  for (j=no; j<boxes_len; j++) {
    if (j==0) {
    the_options = our_array[0][1];
    addOptions(the_options, boxes[j]);
    }
    else {
    pVal = boxes[j-1].value;
      for (k = 0; k<arr_len; k++) {
      if (our_array[k][0] == pVal) {
      the_options = our_array[k][1];
      addOptions(the_options, boxes[j]);
      }
    }
    }
  }
} 

function addOptions(the_options, the_sel) {
  len = the_options.length;
  while (the_sel.hasChildNodes()) {
    the_sel.removeChild(the_sel.firstChild);
  }
  for (i=0; i<len; i++) {
    op = document.createElement("option");
    the_val = the_options[i];
    val = document.createAttribute('value');
    val.value = the_val; 
    op.setAttributeNode(val);
    the_text = document.createTextNode(the_val);
    op.appendChild(the_text);
    if (i==0) {
    op.selected=true;
    }
    the_sel.appendChild(op);
  }
}

</script>
                <%
                if(session.getAttribute("wrong_pass") != null){
                %>
                <script>
                    alert("Password and Confirm Password do not match!");
                </script>
                <%
                    session.removeAttribute("wrong_pass");
                }
                %>
                <%
                if(session.getAttribute("wrong_query") != null){
                %>
                <script>
                    alert("Entered Faculty ID isalready present");
                </script>
                <%
                    session.removeAttribute("wrong_query");
                }
                %>
                <%
                if(session.getAttribute("wrong_details") != null){
                %>
                <script>
                    alert("please enter fields correctly");
                </script>
                <%
                    session.removeAttribute("wrong_details");
                }
%>

<h1 class="heading"> Add Faculty <img src="../assets/images/faculty.png" alt="Welcome" style="float:left;width:200px; height:200px"><button onclick="location.href='admin_homepage.jsp';" style="background-color: #d6d6c2;
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
<form action="addFacultyValidation.jsp" method="post">
  <fieldset id="places">
  <legend>Add faculty</legend>
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" required>
    <pre><br></pre>
    <label for="Faculty_id">Faculty id:</label>
    <input type="text" name="Faculty_id" id="Faculty_id" required>
    <pre><br></pre>

    <label for="Gender">Gender:</label>
    <input type="radio" name="type_addFaculty" value="male" >male
    <input type="radio" name="type_addFaculty" value="female">female
    <pre><br></pre>
    <label for="contactNo">Contact No:</label>
    <input type="text" name="contactNo" required>
    <pre><br></pre>


    <label for="department">Department:</label>
<select id="dept" name="dept"></select>
<pre><br></pre>
<label for="semester">Semester:</label>
<select id="sem1" name="sem1" required></select>
<pre><br></pre>
<label for="course">Course:</label>
<select id="course1" name="course1" required></select>
<pre><br></pre>
<label for="section">Section:</label>
<select id="section1" name="section1" required>
	<option value="a">a</option>
	<option value="b">b</option>
</select>
<pre><br></pre>
<label for="password">Password:</label>
<input type="text" name="password">
<pre><br></pre>
<label for="confirm_password">Confirm Password:</label>
<input type="text" name="confirm_password" required>
<pre><br></pre>
<div class="btn-group">
    <center><button class="button">submit</button></center>
</div>
</fieldset>
</form>
</body>
</html>
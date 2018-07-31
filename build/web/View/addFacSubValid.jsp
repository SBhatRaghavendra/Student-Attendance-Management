<%-- 
    Document   : addFacSubValid
    Created on : 6 Nov, 2017, 8:15:49 PM
    Author     : pc
--%>
<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
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
        <title>testing </title>
        <link rel="stylesheet" type="text/css" href="../assets/commonCSS/styleCommon.css">
    </head>
    <body>
        
        <%
            Connection con=null;
            String cNum=null,gender=null,pass=null,courseId=null;
            String fname=request.getParameter("name");
            String fid=request.getParameter("Faculty_id");
            //String deptId=request.getParameter("deptId");
            //String sem=request.getParameter("sem");
            String sec=request.getParameter("sec");
            String courseName=request.getParameter("course");

            ResultSet result=null,result1=null,result2=null;

            String deptId=(String) session.getAttribute("deptId");
            session.removeAttribute("deptId");
            String secId=deptId;
            //secId=secId.concat(sem); 
            
            
            //out.println(secId);
            
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
            PreparedStatement statement = con.prepareStatement("select PASSWORD,CONTACT_NO,GENDER from FACULTY where F_ID=?");
            statement.setString(1,fid);
            result = statement.executeQuery();
                
                if(!result.next())
                {
                    out.println("No records");
                }

            cNum=result.getString("CONTACT_NO");
            gender=result.getString("GENDER");
            pass=result.getString("PASSWORD");
            //out.println(courseName+" "+deptId);

//out.println(courseName);
            PreparedStatement statement2 = con.prepareStatement("select COURSE_ID from COURSE where COURSE_NAME=? and DEPARTMENT_ID=?");
            statement2.setString(1,courseName);
            statement2.setString(2,deptId);
            result2 = statement2.executeQuery();
                
                if(!result2.next())
                {
                    out.println("No records");
                }

            courseId=result2.getString(1);
           //out.println(courseId);
           char c;
           if(courseId.length()==5){
               c=courseId.charAt(3);
               
           
           }
           else{
                c=courseId.charAt(2);
         
           }
           //out.println(c);
            secId=secId+c;
           
           //out.println(secId);
           if(sec.equals("a"))                     //chnge acc to table content
               secId= secId.concat("1");
            else
                secId=secId.concat("2");
//
//
            Statement statement1 = con.createStatement();
            statement1.executeQuery("insert into FACULTY(F_ID,SEC_ID,FACULTY_NAME,PASSWORD,DEPT_ID,COURSE_ID,CONTACT_NO,GENDER) values('"+fid+"','"+secId+"','"+fname+"','"+pass+"','"+deptId+"','"+courseId+"','"+cNum+"','"+gender+"')");
            }
            catch(SQLException e){
                 session.setAttribute("wrong_query", "1");
                 response.sendRedirect("update_faculty.jsp");

            }


            try{
            %>
                <br>
                <br>
                <center><p style="color:blueviolet;font-size: 30px">Data Entered Successfully</p></center>
                <br>
                <br>
                <br>
                <div class="btn-group">
                    <form action="update_faculty.jsp" method="post">
                         <div class="btn-group">
                            <center><button class="button">Continue</button></center>
			</div>
                    </form>
                </div>
            <%
            }catch(Exception e){

            }
   
          
           %>
    </body>
</html>

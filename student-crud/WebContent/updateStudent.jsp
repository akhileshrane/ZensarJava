<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*"%>
<%@page import="akhilesh.*"%>
<%@page import="java.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student</title>
</head>
<body>
<h2>Update Student</h2>
<form name="updateStudentForm" action="updatingStudent.jsp">
<table>
<% 
int m= Integer.parseInt(request.getParameter("rollNumber"));
String driverName = "com.mysql.jdbc.Driver";
String url= "jdbc:mysql://localhost/akhilesh";
String userName="root";
String password="root";
Class.forName(driverName);
Connection con= DriverManager.getConnection(url,userName,password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from student where rollno="+m+";");
while(rs.next()) {
	int rollNumber = rs.getInt("rollno");
	String studentName=rs.getString("name");
	int age=rs.getInt("age");
	String course = rs.getString("course");
	Student student = new Student(rollNumber,studentName,age,course);
%>
	<tr>
		<td>Roll No.</td>
		<td><input type="text" name="rollNumber" value="<%=m%>"/></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="studentName" value="<%=student.getName() %>" /></td>
	</tr>
		<tr>
		<td>Age</td>
		<td><input type="text" name="age" value="<%=student.getAge() %>" /></td>
	</tr>
	<tr>
		<td>Course</td>
		<td><input type="text" name="course" value="<%= student.getCourse()%>" /></td>
	</tr>
		<tr>
		<td><input type="submit" value="Update" /></td>
		<td><input type="reset" value="Cancel" /></td>
	</tr>
	
<%
}
%>

</table>

</form>

<br><br>
<a href="index.jsp">Click here to go to index page</a>
</body>
</html>
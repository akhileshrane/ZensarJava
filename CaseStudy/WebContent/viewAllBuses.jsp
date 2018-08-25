<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Buses:</title>
</head>
<body>
<h2>Bus List</h2>
<br><br>
	<table border="1">
		<tr>
			<td>Bus Name</td>
			<td>Bus Station:</td>
			<td>Platform:</td>
			<td>Arrival Time:</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>

<%
//StudentDao studentDao=new StudentDao();
//List <Student> allStudentList = studentDao.getAllStudents();
//for (Student student: allStudentList) {
%>
		<tr>
			<td><%=//student.getRollNumber() %></td>

			<td><%= //student.getName() %></td>

			<td><%= //student.getAge() %></td>

			<td><%=//student.getCourse() %></td>
			<td><a href="updateBus.jsp?rollNumber=<%=//student.getRollNumber()%>">Edit</a></td>
			<td><a href="deleteBus.jsp?rollNumber=<%=//student.getRollNumber()%>">Delete</a></td>

		</tr>
<%
//}
%>


	</table>
</body>
</html>
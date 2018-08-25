<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" >
<title>Add Student</title>
</head>
<body>
<h2>Add Student</h2>
<form name="addStudentForm" action="addition.jsp">
<table>
	<tr>
		<td>Roll No.</td>
		<td><input type="text" name="rollNumber" />
		</td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="studentName" /></td>
	</tr>
		<tr>
		<td>Age</td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
		<td>Course</td>
		<td><input type="text" name="course" /></td>
	</tr>
		<tr>
		<td><input type="submit" value="Add" /></td>
		<td><input type="reset" value="Cancel" /></td>
	</tr>
</table>
<br><br>
</form>



<a href="index.jsp">Click here to go to index page</a>

</body>
</html>
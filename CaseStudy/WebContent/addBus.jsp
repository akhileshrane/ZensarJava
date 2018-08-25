<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a new Bus:</title>
</head>
<body>
<form name="addBusForm" action="addingBus.jsp">
<table>
	<tr>
		<td>Bus Name: </td>
		<td><input type="text" name="busName"/>
		</td>
	</tr>
	<tr>
		<td>Arrival Time: </td>
		<td><input type="text" name="arrivalTime"/></td>
	</tr>
	<tr>
		<td>Wait Status:</td>
		<td><input type="text" name="waitStatus"/></td>
	</tr>
		<td><input type="submit" value="Add" /></td>
		<td><input type="reset" value="Cancel" /></td>
	</tr>
</table>
<br><br>
</form>
<a href="managerSection.jsp">Go back to admin Section</a>
<br><br>
<a href="index.jsp">Log out</a>
</body>
</html>
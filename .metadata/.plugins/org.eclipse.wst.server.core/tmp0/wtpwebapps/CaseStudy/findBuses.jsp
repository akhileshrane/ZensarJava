<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Find a bus</title>
</head>
<body>
<form name="findBusForm" action="bus.jsp">
<table>
	<tr>
		<td>Enter Bus Station Name:</td>
		<td><input type="text" name="busStationName" />
		</td>
	</tr>
	<tr>
		<td>Enter Bus Name:</td>
		<td><input type="text" name="busName" /></td>
	</tr>
		<tr>
		<td>Arrival Time:</td>
		<td><input type="text" name="arrivalTime" /></td>
	</tr>
		<tr>
		<td><input type="submit" value="Add" /></td>
		<td><input type="reset" value="Cancel" /></td>
	</tr>
</table>
<br><br>
</form>
</body>
</html>
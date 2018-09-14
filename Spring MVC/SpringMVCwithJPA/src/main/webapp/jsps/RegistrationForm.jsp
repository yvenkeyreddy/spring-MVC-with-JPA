<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>
	<center>
		<h2>Employee Registration Form</h2>
		<form:form modelAttribute="employee">
			<table>
				<tr>
					<td>Employee Number</td>
					<td><form:input path="employeeNumber" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><form:input path="employeeName" /></td>
				</tr>
				<tr>
					<td>Employee Salary</td>
					<td><form:input path="employeeSalary" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="SAVE"></td>
					<td></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>
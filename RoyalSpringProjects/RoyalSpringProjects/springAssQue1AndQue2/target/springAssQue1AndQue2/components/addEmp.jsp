<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>
	<h1>Add New Employee</h1>
	<form:form action="addEmp" modelAttribute="emp">
	Name: <form:input path="name"/><br/>
	Salary: <form:input path="salary"/><br/>
	Designation: <form:input path="Designation"/><br/>
	<input type="submit" value="Save">
	</form:form>
</body>
</html>
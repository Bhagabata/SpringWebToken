<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="emp.Employee, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employees</title>
</head>
<body>
	<h1>View Employees List</h1>
	<%!List<Employee> emps;%>
	<table border="1">
	<tr><th>ID</th><th>Name</th><th>Salary</th><th>Designation</th></tr>
		<%
		emps = (List<Employee>) request.getAttribute("emps");
		for (Employee emp : emps) {
			out.println("<tr><td>" + emp.getId() + "</td><td> " + emp.getName() + " </td><td> " + emp.getSalary()
			+ " </td><td> " + emp.getDesignation() + " </td></tr>");
		}
		%>
	</table>
	<a href="add">Add employee</a>
</body>
</html>
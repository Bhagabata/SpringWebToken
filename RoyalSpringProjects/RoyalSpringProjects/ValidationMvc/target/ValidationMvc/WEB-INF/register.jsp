<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="submitForm" modelAttribute="reg">

		Name: <form:input path="Name" />
		<br><br>  
        Salary: <form:input path="salary" />
		<br><br>  
       Designation: <form:input path="Designation" />
		<br><br>
 <input type="submit" value="Submit" /> 
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<style type="text/css">
.error{color: red}
</style>
</head>
<body>
	<h1>Enter Your Details to Register</h1>
	<form:form action="validate" modelAttribute="user">
		First Name: <form:input path="firstName"/><br/>
		<form:errors path="firstName" cssClass="error"/><br/>
		Last Name: <form:input path="lastName"/><br/>
		<form:errors path="lastName" cssClass="error"/><br/>
		User Name: <form:input path="userName"/><br/>
		<form:errors path="userName" cssClass="error"/><br/>
		Age: <form:input path="age"/><br/>
		<form:errors path="age" cssClass="error"/><br/>
		About me: <form:textarea path="aboutme"/><br/>
		<form:errors path="aboutme" cssClass="error"/><br/>
		Email: <form:input path="email"/><br/>
		<form:errors path="email" cssClass="error"/><br/>
		Password: <form:password path="password"/><br/>
		<form:errors path="password" cssClass="error"/><br/>
		Is Working: Yes <form:radiobutton path="Working" value="true"/>
		No <form:radiobutton path="Working" value="false"/>
		<form:errors path="Working" cssClass="error"/><br/>
		Is Student: Yes <form:radiobutton path="Student" value="true"/>
		No <form:radiobutton path="Student" value="false"/>
		<form:errors path="Student" cssClass="error"/><br/>
		<input type="submit" value="Register">
	</form:form>	
</body>
</html>
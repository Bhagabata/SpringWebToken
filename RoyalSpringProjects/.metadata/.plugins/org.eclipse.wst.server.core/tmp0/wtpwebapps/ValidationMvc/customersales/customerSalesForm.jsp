<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Sales Data</title>
<style type="text/css">
	.error{color: red}
</style>
</head>
<body>
	<h1>Customer Sales Data</h1>
	<form:form action="validate" modelAttribute="cust">
			Customer First Name: <form:input path="custFname"/><br/>
			<form:errors path="custFname" cssClass="error"/><br/>
			Customer Last Name: <form:input path="custLname"/><br/>
			<form:errors path="custLname" cssClass="error"/><br/>
			Address Code: <form:input path="addressCode"/><br/>
			<form:errors path="addressCode" cssClass="error"/><br/>
			Location: <form:input path="location"/><br/>
			<form:errors path="location" cssClass="error"/><br/>
			Sales Quantity: <form:input path="salesqty"/><br/>
			<form:errors path="salesqty" cssClass="error"/><br/>
			Total Amount: <form:input path="totalAmount"/><br/>
			<form:errors path="totalAmount" cssClass="error"/><br/>
			Target Achieved: <form:input path="targetAchived"/><br/>
			<form:errors path="targetAchived" cssClass="error"/>
			<input type="submit" value="Submit">
	</form:form>
</body>
</html>
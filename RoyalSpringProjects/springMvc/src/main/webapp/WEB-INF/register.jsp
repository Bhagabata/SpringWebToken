<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="helloagain" modelAttribute="emp">  
Username: <form:input path="name"/> <br><br>  
<form:errors path="name" cssClass="error"/><br><br>
Password(*): <form:password path="pass"/> <br><br>
<form:errors path="pass" cssClass="error"/><br><br>
postalCode: <form:input path="postalCode"/> <br><br>
<form:errors path="postalCode" cssClass="error"/><br><br>
freePasses: <form:input path="freePasses"/> <br><br>
<form:errors path="freePasses" cssClass="error"/><br><br>
<input type="submit" value="Confirm">  
</form:form>
</body>
</html>
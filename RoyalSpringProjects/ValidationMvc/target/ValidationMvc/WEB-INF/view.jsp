<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Hello here is your details</p>  
<table border="1">
<tr><th>Name</th><th>Salary</th><th>Designation</th></tr>
	<c:forEach var="emp" items="${reg.rows}">
		<tr>
			<td><c:out value="${reg.Name}"></c:out></td>
			<td><c:out value="${reg.salary}"></c:out></td>
			<td><c:out value="${reg.Designation}"></c:out></td>
                </tr>
          </c:forEach>
	 </table>
</body>
</html>
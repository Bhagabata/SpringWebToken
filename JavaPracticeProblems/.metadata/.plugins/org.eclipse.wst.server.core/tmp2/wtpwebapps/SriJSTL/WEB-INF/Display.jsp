<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <c:set var="DummyName" value="DummyValue2"/>                    <!-- set tag it is used to create variables --> 
<c:out value="${DummyName}">No name</c:out>               <!--// out tag  -->

<%-- <c:if test="${dummyName==null}"> <!--If tag-->
empty
</c:if> --%>
<%-- <c:forEach var="headerValue" items="${header}">  <!--For Each-->
${headerValue.key},${headerValue.value} <br>
</c:forEach> --%>

<%-- <c:choose>
  <c:when test="${dummyName==null}">
empty
</c:when>

  <c:when test="${dummyName==dummyName}">
dummyName
</c:when>
<c:otherwise>
something else....
</c:otherwise>

</c:choose> --%>

</body>
</html>
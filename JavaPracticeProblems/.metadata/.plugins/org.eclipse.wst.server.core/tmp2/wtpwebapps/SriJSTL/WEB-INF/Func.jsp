<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var= "str" value= "srihari is a Java developer" />
Length:${fn:length(str)}
<c:forEach items= "${fn:split(str,' ')}" var="s">
<br>
 ${s}
 </c:forEach>
 
 index : ${fn:indexOf(str,"is")}
 
 is there: ${fn:contains(str,"Java")}  ]

<c:if test= "${fn:contains(str, 'JSP'}">
JSP is Der 
</c:if>                             
 
 
 
 
 
 
 

</body>
</html>
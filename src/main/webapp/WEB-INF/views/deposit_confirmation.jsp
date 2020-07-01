<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Deposit confirmed</title>
		</head>
		
	<body>
	
	Your deposit was confirmed!
	
	<a href="${contextPath}/preview">Go back to preview</a>

	</body>
	
	</html>
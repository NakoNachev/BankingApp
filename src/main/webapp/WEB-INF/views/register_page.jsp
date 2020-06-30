<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Register</title>
	</head>
	
	
	<body>
	
	<!-- ID is automatically generated, balance always starts with 0 -->
	
	<form:form action="checkRegistration" modelAttribute="user">
	
		Please choose a: <br>
		Username: <form:input type="text" path="username" /> <br>
		Password: <form:input type="password" path="password" /> <br>
		Email: <form:input type="text" path="email" /> <br>
		
		<input type="submit" value="Register" /> <br>
	
	</form:form>

	</body>
</html>
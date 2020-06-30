<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>


<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	
	<body>
	
	
	
	Welcome to NBanking!
	
	<span> ${wrongPasswordMessage}</span> <br>
	
	
	<form:form action="successfulLogin" modelAttribute="user">
	
		Username: <form:input type="text" path="username" /> <br>
		Password: <form:input type="password" path="password" /> <br>
		
		<input type="submit" value="Login" /> <br>
	
	</form:form>
	
	

	</body>
</html>
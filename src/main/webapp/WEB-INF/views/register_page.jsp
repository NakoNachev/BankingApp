<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Register</title>
	</head>
	
	
	<body>
	
	
	<form:form action="successfulRegistration" modelAttribute="user">
	
		Please choose a: <br>
		Username: <form:input type="text" path="nickname" /> <br>
		Password: <form:input type="password" path="password" /> <br>
		
		<input type="submit" value="Login" /> <br>
	
	</form:form>

	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login here...</h2>
	<div>
		<%
			if(request.getAttribute("error")!=null){
				out.println(request.getAttribute("error"));
			}
		%>
	</div>
	<form action="verifyLogin" method="post">
		Email : <input type="email" name="email"/>
		Password : <input type="password" name="password"/>
		<input type="submit" value="login">
			
	</form>
</body>
</html>
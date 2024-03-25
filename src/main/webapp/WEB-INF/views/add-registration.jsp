<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add registration</title>
</head>
<body>
		<h2>Add registration</h2>
		<form action="addReg" method="post">
			<pre>
					Name : <input type="text" name="name">
					Email : <input type="email" name="email">
					Course : <input type="text" name="course">
					Mobile : <input type="text" name="mobile">
					<input type="submit" value="save">
			</pre>
		
			
		</form>
		

</body>
</html>
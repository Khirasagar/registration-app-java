<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Course</th>
				<th>Mobile</th>
			</tr>
			
			<%
				ResultSet result = (ResultSet)request.getAttribute("result");	
				while(result.next()){ %>
					
			<tr>
				<td><%=result.getString(1) %></td>
				<td><%=result.getString(2) %></td>
				<td><%=result.getString(3) %></td>
				<td><%=result.getString(4) %></td>
			</tr>
				
				<%
				}				
				%>
			
		</table>

</body>
</html>
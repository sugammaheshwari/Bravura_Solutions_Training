<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us </title>
<style>
h1 {text-align: center;}
p {text-align: center;}
div {text-align: center;}
</style>
</head>
<body>

	<%
		if(session.getAttribute("uname")==null)
			response.sendRedirect("login.jsp");
	%>

		<h1>  we are a product based company 
		  proving software solutions to all users :) <br> <br>
		All over the world <br>
		 Come back to see our work in in progress !!! </h1> <br>
		 
		 <form action="Logout">
	<input type="submit" value="Logout">
	</form>
		 
</body>
</html>
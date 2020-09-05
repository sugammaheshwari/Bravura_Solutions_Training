<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

	<h1>Logged in successfully !!!	<br> 
	Welcome ${uname} !!! <br> </h1>
	
	<a href="AboutUs.jsp"> About Us</a> <br>
	
	<form action="Logout">
	<input type="submit" value="Logout">
	</form>
	
</body>
</html>
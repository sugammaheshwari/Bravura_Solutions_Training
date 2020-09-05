<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
h1 {text-align: center;}
p {text-align: center;}
div {text-align: center;}
</style>
</head>

<body>
	<h1> Please enter your Details to login...</h1>

<form method="post" action="./LoginServlet">
	Username: <input type="text" name="uname"/> <br/>
	Password: <input type="password" name="pass"/> <br/>
	<input type="submit" value="Login" />
</form>


</body>
</html>
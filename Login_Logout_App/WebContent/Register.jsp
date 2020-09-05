<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
h1 {text-align: center;}
p {text-align: center;}
div {text-align: center;}
</style>
</head>
<body>

<h1> WELCOME ! TO OUR NEW USER PORTAL </h1>

<h1> Please enter your registration details!</h1>

<form method="post" action="./NewRegisteration">
	Username: <input type="text" name="uname"/> <br/>
	Password: <input type="password" name="pass"/> <br/>
	Confirm Password: <input type="password" name="cpass"/> <br/>
	<input type="submit" value="Login" />
</form>
</body>
</html>
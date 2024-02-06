<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<h2>SignUp</h2>
<form action="saveuser" method="post">
FirstName:<input type="text" name="firstname"placeholder="enter firstname"/><br><br>
LastName:<input type="text" name="lastname"placeholder="enter lastname"/><br><br>
Email:<input type="text" name="email"><br><br>
PassWord:<input type="password" name="password"><br><br>
<input type="submit" value="SignUp"/>
</form>
<a href="login">LogIn</a>

</body>
</html>
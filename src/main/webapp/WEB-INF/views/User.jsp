<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveusers"method="post">
FirstName:<input type="text"name="firstName"><br><br>
LastName:<input type="text"name="lastName"><br><br>
Email:<input type="text"name="email"><br><br>
PassWord:<input type="text"name="passWord"><br><br>
Gender:<input type="radio"name="gender"value="female">
        <label for="female">FEMALE</label><br><br>
       <input type="radio"name="gender"value="male">
        <label for="male">MALE</label> <br><br>



ContactNo:<input type="text"name="ContactNo"><br><br>
DOB:<input type="text"name="DOB"><br><br>
Address:<input type="text"name="Address"><br><br>
City:<input type="text"name="City"><br><br>
State:<input type="text"name="State"><br><br>
Otp:<input type="text"name="Otp"><br><br>
RoleId:<input type="text"name="RoleId"><br><br>
<input type="submit" value="submit"> 





</form>

</body>
</html>
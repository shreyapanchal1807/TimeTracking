<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="savetask" method="post"><br></br>
TaskId:<input type="text" name="TaskId"><br></br>
ModuleId:<input type="text" name="ModuleId"><br></br>
ProjectId:<input type="text" name="ProjectId"><br></br>
Status:<input type="text" name="Status"><br></br>
EstimatedHours:<input type="time" name="EstimatedHours"><br></br>
TotalUtilizedHours:<input type="time" name="TotalUtilizedHours"><br></br>
Description:<input type="text" name="Description"><br></br>
DocURL:<input type="text" name="DocURL"><br></br>
Title:<input type="text" name="Title"><br></br>
<input type="submit" value="submit">

</form>>
</body>
</html>
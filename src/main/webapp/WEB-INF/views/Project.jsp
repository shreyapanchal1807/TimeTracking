<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Project</h2>
<form action="saveproject" method="post">
Title:<input type="text"name="title"><br><br>
Description:<input type="text"name="description"><br><br>
ProjectStatusId:<input type="text"name="projectStatusId"><br><br>
DocURL:<input type="text"name="docURL"><br><br>
EstimatedHours:<input type="text"name="estimatedHours"><br><br>
TotalUtilizedHours:<input type="text"name="totalUtilizedHours"><br><br>
ProjectStartDate:<input type="text"name="projectStartDate"><br><br>
ProjectCompletionDate<input type="date"name="projectCompletionDate"><br><br>

<input type="Submit"name="SUBMIT"><br><br>
</form>







</body>
</html>
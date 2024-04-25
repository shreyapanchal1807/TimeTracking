<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="savetaskuser"method="post">
userId:
<select name="userId">
<option value="-1">-----select user-----</option>
<c:forEach items="${urs}" var="user">
<option value="${user.userId }">${user.email }</option>
</c:forEach>
</select>
<br><br>
taskId:
<select name="taskId">
<option value="-1">-----select task-----</option>
<c:forEach items="${tsk}" var="task">
<option value="${task.taskId }">${task.title }</option>
</c:forEach>
</select><br><br>

TaskUserId:<input type="text" name="taskUserId"><br><br>
UserId:<input type="text" name="userId"><br><br>
TaskId:<input type="text" name="taskId"><br><br>
AssignStatus:

<select name="assignStatus">
 <option value="-1">----select status----</option>
 <option value="1">Assign</option>
 <option value="2">Revoke</option>
 </select>
 <br><br>
StatusId:

<select name="statusId">
<option value="-1">-----select status-----</option>
<c:forEach items="${prSts}" var="pjSts">
<option value="${pjSts.projectStatusID}">${pjSts.projectStatus }</option>
</c:forEach>
</select><br><br>

UtilizedHours:<input type="text" name="utilizedHours"><br><br>

<input type="submit" name="submit"><br><br>
</form>
</body>
</html>
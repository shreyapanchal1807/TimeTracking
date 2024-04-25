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
	<form action="saveprojectstatus" method="post">
		userId: <select name="userId">
			<option value="-1"> ----select user-----</option>
			<c:forEach items="${user}" var="userr">
				<option value="${userr.userId }">${userr.email}</option>
			</c:forEach>
		</select><br>
		<br> projectId: <select name="projectId">
			<option value="-1"> ----select project-----</option>
			<c:forEach items="${prj}" var="prjct">
				<option value="${prjct.projectID }">${prjct.title}</option>
			</c:forEach>
		</select><br>
		<br> ProjectUser:<input type="text" name="projectUserId"><br>
		<br> UserId:<input type="text" name="userId"><br>
		<br> ProjectId:<input type="text" name="projectId"><br>
		<br> AssignStatus: <select name="assignStatus">
			<option value="-1">----select status----</option>
			<option value="1">Assign</option>
			<option value="2">Revoke</option>
		</select> <br>
		<br> <input type="submit" value="submit">
	</form>


</body>
</html>
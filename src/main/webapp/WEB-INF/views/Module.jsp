<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Module Form</title>
</head>
<body>

<form action="submit_form.php" method="post">
    <label for="moduleId">Module ID:</label>
    <input type="text" id="moduleId" name="moduleId" required><br>

    <label for="moduleName">Module Name:</label>
    <input type="text" id="moduleName" name="moduleName" required><br>

    <label for="projectId">Project ID:</label>
    <input type="text" id="projectId" name="projectId" required><br>

    <label for="status">Status:</label>
    <input type="text" id="status" name="status" required><br>

    <label for="description">Description:</label>
    <textarea id="description" name="description" rows="4" required></textarea><br>

    <label for="docURL">Documentation URL:</label>
    <input type="text" id="docURL" name="docURL"><br>

    <label for="estimatedHour">Estimated Hours:</label>
    <input type="text" id="estimatedHour" name="estimatedHour" required><br>

    <label for="totalUtilizedHours">Total Utilized Hours:</label>
    <input type="text" id="totalUtilizedHours" name="totalUtilizedHours" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
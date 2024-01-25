<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="model.Task" %>
<%@ page import="model.TaskListBean" %>
<html>
<head>
    <title>Add Task</title>
</head>
<body>
    <h1>Add a new task</h1>
    <form action="AddTaskServlet" method="post">
        Task Name: <input type="text" name="taskName" required>
        <input type="submit" value="Add Task">
    </form>
</body>
</html>

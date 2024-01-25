<%@ page import="java.util.List" %>
<%@ page import="model.Task" %>
<%@ page import="model.TaskListBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.TaskListBean" %>
<%@ page import="java.util.Optional" %>
<html>
<head>
    <title>ToDoListWebApp</title>
</head>
<body>
    <h1>Welcome to ToDoListWebApp</h1>
    <p>List of tasks:</p>
    <ul>
        <% 
            TaskListBean taskListBean = Optional.ofNullable((TaskListBean) request.getAttribute("taskListBean"))
                .orElseGet(TaskListBean::new);
            request.setAttribute("taskListBean", taskListBean);
            List<Task> taskList = taskListBean.getTaskList();
        %>
        <% for (Task task : taskList) { %>
             <li>
                <%= task.getName() %>
                (<a href="CompleteTaskServlet?id=<%= task.getId() %>">Complete</a>,
                <a href="DeleteTaskServlet?id=<%= task.getId() %>">Delete</a>)
            </li>
        <% } %>
    </ul>

    <p><a href="addTask.jsp">Add a new task</a></p>
</body>
</html>

package controll;


import model.Task;
import model.TaskListBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AddTaskServlet")
public class AddTaskServlet extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskName = request.getParameter("taskName");

        if (taskName != null && !taskName.isEmpty()) {
            Task task = new Task(taskName);

            TaskListBean taskListBean = (TaskListBean) getServletContext().getAttribute("taskListBean");
            if (taskListBean == null) {
                taskListBean = new TaskListBean();
                getServletContext().setAttribute("taskListBean", taskListBean);
            }

            taskListBean.addTask(task);

            request.setAttribute("taskListBean", taskListBean);
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

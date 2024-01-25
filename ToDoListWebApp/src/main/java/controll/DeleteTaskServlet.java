package controll;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TaskListBean;

import java.io.IOException;

@WebServlet("/DeleteTaskServlet")
public class DeleteTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteTaskServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int taskId = Integer.parseInt(request.getParameter("id"));

        TaskListBean taskListBean = (TaskListBean) getServletContext().getAttribute("taskListBean");

        taskListBean.deleteTask(taskId);

        request.setAttribute("taskListBean", taskListBean);

        request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}

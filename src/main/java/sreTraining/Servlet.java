package sreTraining;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}
}

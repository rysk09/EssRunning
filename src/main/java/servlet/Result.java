package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AccessData;
import model.Data;
import model.Input;
import model.User;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("loginUser");
		// session.removeAttribute("health");
		// forwardPath = "healthCheckResult.jsp";
		
		Input input = (Input) session.getAttribute("Input");
		
		String userId = user.getId();
		double dist = input.getDist();
		double distTotal = 0;
		Data data = new Data(userId, dist);
		
		AccessData accessData = new AccessData();
		accessData.postData(data);
		List<Data> dataList = accessData.getData(userId);
		distTotal = accessData.sumDist(userId);
		System.out.println(distTotal);
		
		request.setAttribute("dataList", dataList);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Result.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

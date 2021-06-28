package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CalcDist;
import model.Input;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String weightStr = request.getParameter("weight");
		String kcalStr = request.getParameter("kcal");
		double weight = Double.parseDouble(weightStr);
		double kcal = Double.parseDouble(kcalStr);
		CalcDist calcDist = new CalcDist();
		double dist = calcDist.calc(weight, kcal);
		
		// System.out.println(weight);
		// System.out.println(kcal);
		// System.out.println(dist);
		
		Input input = new Input();
		input.setWeight(weight);
		input.setKcal(kcal);
		input.setDist(dist);
		
		// リクエストスコープに保存、フォワード遷移の場合のみ有効
		// request.setAttribute("Input", input);
		
		// セッションスコープに保存
		HttpSession session = request.getSession();
		session.setAttribute("Input", input);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("show.jsp");
		dispatcher.forward(request, response);
	}

}

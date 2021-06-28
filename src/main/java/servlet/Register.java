package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		int times = 0;
		
		
		User user = new User(id,pass);
		RegisterLogic registerLogic = new RegisterLogic();
		boolean isRegister = registerLogic.execute(user);
		
		if(isRegister) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/registerResult.jsp");
			dispatcher.forward(request, response);
		}else {RequestDispatcher dispatcher =
				request.getRequestDispatcher("/register.jsp");
		dispatcher.forward(request, response);
		times += 1;}
		
	}

}

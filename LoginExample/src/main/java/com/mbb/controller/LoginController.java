package com.mbb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mbb.dto.User;
import com.mbb.service.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService service = new UserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User u = new User();
		u.setUid(request.getParameter("t1"));
		u.setPassword(request.getParameter("t2"));

		User user = service.checkLogin(u);
		if (user != null) {
			HttpSession ses = request.getSession();
			ses.setAttribute("user", user);
			if (user.getRole().equals("user")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome.jsp");
				dispatcher.forward(request, response);
			} else if (user.getRole().equals("admin")) {
					request.setAttribute("userlist", service.getAll());
					RequestDispatcher dispatcher = request.getRequestDispatcher("Admin.jsp");
					dispatcher.forward(request, response);
			}
		} else {
			request.setAttribute("msg", "Invalid User Data");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession ses = request.getSession();
		ses.invalidate();
		response.sendRedirect("Login.jsp");
	}
}

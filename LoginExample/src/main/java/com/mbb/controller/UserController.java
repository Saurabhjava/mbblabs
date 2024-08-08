package com.mbb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mbb.dto.User;
import com.mbb.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService service=new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=new User(request.getParameter("t1"),request.getParameter("t2"),request.getParameter("t3"));
		String result=service.addUser(u);
		request.setAttribute("Result", result);
		RequestDispatcher dis=request.getRequestDispatcher("AddUser.jsp");
		dis.forward(request, response);
	}

}

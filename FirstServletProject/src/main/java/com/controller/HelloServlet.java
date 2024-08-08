package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.LoginService;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	LoginService service=new LoginService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		if(service.validateUser(uname, pass)) {
			//response.sendRedirect("jsps/Welcome.jsp");
			RequestDispatcher dis=request.getRequestDispatcher("jsps/Welcome.jsp");
			dis.forward(request, response);
		}
		else {
			//response.sendRedirect("jsps/Error.jsp");
			out.println("<h1 style='color:red'>Invalid User and Password</h1>");
			RequestDispatcher dis=request.getRequestDispatcher("jsps/Login.html");
			dis.include(request, response);
		}
		
	}
	
	

}

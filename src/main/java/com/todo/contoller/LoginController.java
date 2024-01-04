package com.todo.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.LoginDAO;
import com.todo.model.Login;
@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		authenticate(request,response);
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		
		
		boolean validate = LoginDAO.validate(login);
		if(validate)
		{
			   RequestDispatcher dispatcher = request.getRequestDispatcher("todo-list.jsp");
               dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("ERROR_MESSAGE", "Invalid username or password. Please try again.");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}
    
	
	
}

package com.todo.contoller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.UserDAO;
import com.todo.model.User;
@WebServlet("/register")
public class UserController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		register(request,response);
	}

	private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    User user = new User();
	    user.setFirstname(firstname);
	    user.setLastname(lastname);
	    user.setUsername(username);
	    user.setPassword(password);
	    
	    int result = UserDAO.registerEmployee(user);
	    if (result == 1) {
            request.setAttribute("NOTIFICATION", "User Registered Successfully!");
        }
	    RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
        rd.forward(request, response);
	}
		

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.sendRedirect("register.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
	


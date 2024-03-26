package com.registrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp.model.DAOServiceImpl;

@WebServlet("/addReg")
public class AddRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/add-registration.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String course = request.getParameter("course");
			String mobile = request.getParameter("mobile");
			
			DAOServiceImpl service = new DAOServiceImpl();
			service.connectDB();
			service.addRegistration(name, email, course, mobile);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/add-registration.jsp");
			rd.forward(request, response);
			
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}

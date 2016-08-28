package com.niit.shop;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signupservlet
 */
//@WebServlet("/Signupservlet")
public class Signupservlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Signupservlet() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		String userID = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String conpwd = request.getParameter("conpwd");
		SignupDAO signDAO = new SignupDAO();

		RequestDispatcher dispatcher;

		if (signDAO.isValidUser(userID, email, password, conpwd) == true) 
		{
			// navigate to home page.
			// dispatch to home page with same req and response
			dispatcher = request.getRequestDispatcher("successregister.jsp");// go
																				// to
																				// page
			dispatcher.forward(request, response);// go there

		} else 
		{
			response.setContentType("text/html");
			System.out.println("\nInvalid credentials"); // print on eclipse
															// console
			PrintWriter writer = response.getWriter();// to print on browser
			writer.println("\nPlease enter valid credentials");
			dispatcher = request.getRequestDispatcher("Signup.jsp");// go to
																		// page
			dispatcher.include(request, response);

		}
	}
}



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
 * Servlet implementation class Loginservlet
 */
//@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Loginservlet()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		LoginDAO loginDAO = new LoginDAO();
		RequestDispatcher dispatcher;
		if (loginDAO.isValidUser(userID, password) == true)
		{
			// navigate to home page.
			// dispatch to home page with same req and response
			dispatcher = request.getRequestDispatcher("Home.jsp");// go to page
			dispatcher.forward(request, response);// go there
		} else
		{
			// navigate to login page only
			// include error msg
			response.setContentType("text/html");
			System.out.println("\nInvalid credentials"); // print on eclipse
															// console

			PrintWriter writer = response.getWriter();// to print on browser
			writer.println("\nPlease enter valid credentials");
			//writer.close();
			dispatcher = request.getRequestDispatcher("Login.jsp");// go to
																	// page
			dispatcher.include(request, response);
			// we have to use include
		
	}

}
}

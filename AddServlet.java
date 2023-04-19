package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	// name must be service because service() method belongs to Servlet life cycle.
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		/*
		 * // key-value pair req.setAttribute("k", k); // to print data on Console.
		 * 
		 * // System.out.println("Result is: " + k); // to print the data on web page.
		 * PrintWriter out = res.getWriter(); out.println("Result is: " + k);
		 * 
		 * RequestDispatcher red = req.getRequestDispatcher("sq"); // to pass the
		 * objects. red.forward(req, res);
		 */
		// passing values from one servlet to another servlet with URL Rewriting.
		// res.sendRedirect("sq?k=" + k);

		// passing values to second servlet with the use of session.
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
	}
}

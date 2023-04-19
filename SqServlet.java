package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// It returns the object of an object to typecaste it to integer.
		/*
		 * int k = (int) req.getAttribute("k"); int sum = k; k = k * k; PrintWriter out
		 * = res.getWriter(); out.println("The sum of numbers is:" + sum +
		 * " and the Square of the sum is :" + k);
		 */

		// calling sq servlet by add servlet without sending the Request object.
		/*
		 * int k = Integer.parseInt(req.getParameter("k")); int sum = k; k = k * k;
		 * PrintWriter out = res.getWriter();
		 * 
		 * out.println("The sum of the numbers is :" + sum +
		 * " and the square of the sum is : " + k); System.out.println("sq called??");
		 */

		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k");// It will return the object and we don't want that so typecased to int.
		int sum = k;
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("The sum of the numbers is: " + sum + " and the square of the sum is: " + k);
	}
}

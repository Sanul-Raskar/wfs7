package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer
 */
@WebServlet("/Customer")
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Enumeration<String> params=request.getParameterNames();
//		while(params.hasMoreElements()) {
//			String param=params.nextElement();
//			System.out.println(param);
//			System.out.println(request.getParameter(param));
//			
//		}
		response.setContentType("text/html");
		String customerName=request.getParameter("customerName");
		String customerCode=request.getParameter("customerCode");
		PrintWriter out=response.getWriter();
		out.println("<h2>Customer Name: "+customerName+"</h2>");
		out.println("<h2>Customer Code: "+customerCode+"</h2>");
		out.flush();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.hsbc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = { "/MyServlet", "/abc", "/xyz" },initParams = {
		
}, loadOnStartup = 1)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Servlet Being Destroyed........");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Servlet Being Initialized........");
			
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().println("Hello Everyone");
//		response.getWriter().flush();
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.getWriter().println("<h2>Get Request Response</h2>");
		resp.getWriter().println("<h2>Hello World</h2>");
		resp.getWriter().println("<h2>Today is "+new java.util.Date()+"</h2>");
		
		resp.getWriter().flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		resp.getWriter().println("<h2>Post Request Response</h2>");
		resp.getWriter().println("<h2>Hello World</h2>");
		resp.getWriter().println("<h2>Today is "+new java.util.Date()+"</h2>");
		
		resp.getWriter().flush();
	}
	
	

}

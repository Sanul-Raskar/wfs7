package com.hsbc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet2
 */
@WebServlet("/sserv2")
public class SessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession session=request.getSession(false);
		if(session!=null) {
			response.getWriter().append("<h3>User Name : "+session.getAttribute("user")+"</h3>");
			response.getWriter().append("<h3>Password : "+session.getAttribute("password")+"</h3>");
			
		}
		else
			response.getWriter().append("<h3>Session variables are not set.. Please call /sserv1</h3>");
		response.getWriter().append("<h3>Served at: ").append(request.getContextPath()+"</h3>");
		response.getWriter().append("<h3>"+request.getServletContext().getAttribute("appAttribute")+"</h3>");
		response.getWriter().append("<h3>"+request.getAttribute("requestAttribute")+"</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

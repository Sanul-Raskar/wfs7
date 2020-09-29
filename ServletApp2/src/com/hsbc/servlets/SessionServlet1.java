package com.hsbc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet1
 */
@WebServlet("/sserv1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Application wide attribute sharable across servlet calls with same application
		request.getServletContext().setAttribute("appAttribute", "AppValue");
		
		//Request specific attribute meant for single request with least scope
		request.setAttribute("requestAttribute", "requestValue");
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		
		//Session Attributes For session level
		session.setMaxInactiveInterval(30);
		session.setAttribute("user", "Prince");
		session.setAttribute("password", "abcd1");
		response.getWriter().append("<h3>Setting Session data </h3>");
		response.getWriter().append("<h3>Served at: ").append(request.getContextPath()+"</h3>");
		request.getRequestDispatcher("./sserv2").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

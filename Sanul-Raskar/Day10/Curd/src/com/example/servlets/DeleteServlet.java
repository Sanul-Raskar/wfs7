package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productid = Integer.parseInt(request.getParameter("productid"));

		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		if (productDaoImpl.productExists(productid)) {
			productDaoImpl.deleteRecord(productid);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3>Product deleted successfully. </h3>");
			out.flush();
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3>Product does not exists. </h3>");
			out.flush();
		}
	}

}

package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDaoImpl;
import com.example.entity.Product;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productid = Integer.parseInt(request.getParameter("productid"));
		String productname = request.getParameter("productname");
		String productcat = request.getParameter("productcat");
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productquan = Integer.parseInt(request.getParameter("productid"));
		int productrol = Integer.parseInt(request.getParameter("productrol"));

		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		productDaoImpl
				.insertRecord(new Product(productid, productname, productcat, productprice, productquan, productrol));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Product added successfully. </h3>");
		out.flush();
	}

}

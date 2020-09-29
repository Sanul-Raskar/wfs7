package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDaoImpl;
import com.example.entity.Product;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Product> products = new ArrayList<Product>();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		products = productDaoImpl.retrieveRecords();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.append("<html><head><title>All products</title></head><body>");

		for (Product product : products) {
			out.append("<h2>Product ID: " + product.getProductId() + "</h2>");
			out.append("<h2>Product Name: " + product.getProductName() + "</h2>");
			out.append("<h2>Category: " + product.getCategory() + "</h2>");
			out.append("<h2>Price: " + product.getPrice() + "</h2>");
			out.append("<h2>Quantity: " + product.getQuantity() + "</h2>");
			out.append("<h2>ROL: " + product.getRol() + "</h2><hr/>");
		}

		out.append("</body></html>");
		out.flush();

	}

}

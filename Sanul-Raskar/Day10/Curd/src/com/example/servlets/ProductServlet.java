package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDaoImpl;
import com.example.entity.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductServlet() {

	}

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Product> products = new ArrayList<Product>();
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		products = productDaoImpl.retrieveRecords();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>All products</title></head><body>");
		for (Product product : products) {
			out.println("<h6>Product ID: "+product.getProductId()+"</h6>");
			out.println("<h6>Product Name: "+product.getProductName()+"</h6>");
			out.println("<h6>Category: "+product.getCategory()+"</h6>");
			out.println("<h6>Price: "+product.getPrice()+"</h6>");
			out.println("<h6>Quantity: "+product.getQuantity()+"</h6>");
			out.println("<h6>ROL: "+product.getRol()+"</h6><hr/>");
		}
		out.println("</body></html>");
		out.flush();

	}

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
		out.println("<h6>Product added successfully. </h6>");
		out.flush();

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

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

import org.apache.derby.tools.sysinfo;

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
		System.out.println("Servlet init");

	}

	public void destroy() {
		System.out.println("Servlet destroy");
	}

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

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int productid = Integer.parseInt(request.getParameter("productid"));
		String productname = request.getParameter("productname");
		String productcat = request.getParameter("productcat");
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productquan = Integer.parseInt(request.getParameter("productid"));
		int productrol = Integer.parseInt(request.getParameter("productrol"));

		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		if (productDaoImpl.productExists(productid)) {
			productDaoImpl.updateRecord(
					new Product(productid, productname, productcat, productprice, productquan, productrol));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3>Product updated successfully. </h3>");
			out.flush();
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3>Product does not exists. </h3>");
			out.flush();
		}

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
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

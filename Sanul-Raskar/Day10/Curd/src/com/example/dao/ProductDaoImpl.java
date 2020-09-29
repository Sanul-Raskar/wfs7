package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.example.entity.Product;

public class ProductDaoImpl implements IProduct {

	@Override
	public void insertRecord(Product product) {

		Connection con = DBConnection.createConnection();
		PreparedStatement stmt = null;
		String insertQuery = "INSERT INTO app.product VALUES(?,?,?,?,?,?)";

		try {
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1, product.getProductId());
			stmt.setString(2, product.getProductName());
			stmt.setString(3, product.getCategory());
			stmt.setInt(4, product.getPrice());
			stmt.setInt(5, product.getQuantity());
			stmt.setInt(6, product.getRol());

			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Record inserted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<Product> retrieveRecords() {

		ArrayList<Product> result = new ArrayList<Product>();

		Connection con = null;
		Statement stmt = null;

		String query = "SELECT * FROM app.product";
		System.out.println(query);

		try {
			con = DBConnection.createConnection();
			stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				result.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("category"),
						rs.getInt("price"), rs.getInt("quantity"), rs.getInt("rol")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public void updateRecord(Product product) {

		Connection con = DBConnection.createConnection();
		PreparedStatement stmt = null;
		String updateQuery = "UPDATE app.product SET name=?,category=?,price=?,quantity=?,rol=? WHERE id=? ";

		try {
			stmt = con.prepareStatement(updateQuery);
			stmt.setString(1, product.getProductName());
			stmt.setString(2, product.getCategory());
			stmt.setInt(3, product.getPrice());
			stmt.setInt(4, product.getQuantity());
			stmt.setInt(5, product.getRol());
			stmt.setInt(6, product.getProductId());

			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Record updated");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteRecord(int productId) {

		Connection con = null;
		PreparedStatement stmt = null;
		String deleteQuery = "DELETE FROM app.product WHERE id = ?";

		try {
			con = DBConnection.createConnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setInt(1, productId);

			int r = stmt.executeUpdate();
			if (r > 0) {
				System.out.println("Record deleted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean productExists(int productId) {

		String query = "SELECT distinct 1 id FROM app.product WHERE id = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		boolean flag = false;

		try {
			con = DBConnection.createConnection();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, productId);

			ResultSet r = stmt.executeQuery();
			if (r.next()) {
				System.out.println("Product exists");
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return flag;
	}
}

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
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public void updateRecord(Product p) {

	}

	@Override
	public void deleteRecord(int productId) {

	}

}

package com.example.dao;

import java.util.ArrayList;

import com.example.entity.Product;

public interface IProduct {
	public void insertRecord(Product product);

	public ArrayList<Product> retrieveRecords();

	public void updateRecord(Product product);

	public void deleteRecord(int productId);
	
	public boolean productExists(int productId);

}

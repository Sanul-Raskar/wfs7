package com.example.dao;

import java.util.ArrayList;

import com.example.entity.Product;

public interface IProduct {
	public void insertRecord(Product product);

	public ArrayList<Product> retrieveRecords();

	public void updateRecord(Product p);

	public void deleteRecord(int productId);

}

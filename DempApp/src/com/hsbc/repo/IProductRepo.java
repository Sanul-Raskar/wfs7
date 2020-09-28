package com.hsbc.repo;

import java.util.List;

import com.hsbc.domain.Product;

public interface IProductRepo {

	void saveProduct(Product p);
	void deleteProduct(int productId);
	void updateProduct(int productId);
	List<Product> findProducts();
	
}

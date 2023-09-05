package com.productcrud.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.productcrud.model.Product;

@Component
public interface ProductDao {
	
	public void createProduct(Product p);

	public Product getProduct(int pid);
	
	public List<Product> getAllProduct();
	
	public void updateProduct(int pid);
	
	public void deleteProduct(int pid);
}

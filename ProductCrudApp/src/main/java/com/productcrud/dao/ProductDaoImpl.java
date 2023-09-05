package com.productcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.productcrud.model.Product;

public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	//Create Product
	public void createProduct(Product p) {
		this.hibernateTemplate.save(p);
		
	}

	
	//Read Single Product
	public Product getProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
	}

	//Read All Product
	public List<Product> getAllProduct() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	
	//Update Product
	public void updateProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.update(product);
	}

	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.delete(product);
		
	}
	

}

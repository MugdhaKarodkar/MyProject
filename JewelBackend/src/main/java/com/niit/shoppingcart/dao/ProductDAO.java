package com.niit.shoppingcart.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Product;

@Repository
public interface ProductDAO { // product DAO will interact with repository

	// Declare all CRUD operations
	public boolean saveOrUpdate(Product product);// save product domain obj to
	// database

	// public boolean update(Product product);

	// public boolean delete(Product product);
	public String deleteRow(String id);

	public Product get(String id); // to access complete product

	public List<Product> getList(); // to display complete list

	public Product getRowById(String id);

	public Product getByName(String name);
	 public String update(Product product);

}

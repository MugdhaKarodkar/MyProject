package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Product;

@Repository
public interface ProductDAO { // product DAO will interact with repository

	// Declare all CRUD operations
	public boolean saveorupdate(Product product);// save product domain obj to
											// database

	//public boolean update(Product product);

	public boolean delete(Product product);

	public Product get(String id); // to access complete product

	public List<Product> list();  //to display complete list
	

}

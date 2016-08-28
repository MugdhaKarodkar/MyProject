package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Supplier;

@Repository
public interface SupplierDAO { // supplier DAO will interact with repository

	// Declare all CRUD operations
	public boolean save(Supplier supplier);// save supplier domain obj to
											// database

	public boolean update(Supplier supplier);

	public boolean delete(Supplier supplier);

	public Supplier get(String id); // to access complete supplier

	public List<Supplier> list(); // to display complete list

}

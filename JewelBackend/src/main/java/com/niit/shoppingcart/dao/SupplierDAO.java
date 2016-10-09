package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Repository
public interface SupplierDAO { // supplier DAO will interact with repository

	// Declare all CRUD operations
	public boolean saveOrUpdate(Supplier supplier);// save supplier domain obj to
											// database

	//public boolean update(Supplier supplier);

	//public boolean delete(Supplier supplier);

	public Supplier get(String id); // to access complete supplier

	//public List<Supplier> list(); // to display complete list
	public List<Supplier> getList();
	public String deleteRow(String id);
   
   
    public Supplier getRowById(String id);
   // public String update(Supplier supplier);
    public Supplier getByName(String name);
    public String update(Supplier supplier);
   

}

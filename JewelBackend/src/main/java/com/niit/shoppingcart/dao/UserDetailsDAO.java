package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.UserDetails;

@Repository
public interface UserDetailsDAO { // userDetails DAO will interact with repository

	// Declare all CRUD operations
	public boolean save(UserDetails userDetails);// save userDetails domain obj to
											// database

	public boolean update(UserDetails userDetails);

	public boolean delete(UserDetails userDetails);

	public UserDetails get(String id); // to access complete userDetails

	public List<UserDetails> list();  //to display complete list
	

}

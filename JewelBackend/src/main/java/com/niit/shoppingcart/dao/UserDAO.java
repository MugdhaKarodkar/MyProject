package com.niit.shoppingcart.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.model.User;

@Repository
public interface UserDAO { // userDetails DAO will interact with
							// repository
	// Declare all CRUD operations
	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public User get(String id); // to access complete userDetails

	public List<User> list(); // to display complete list

	public boolean isValidUser(String id, String password);

}

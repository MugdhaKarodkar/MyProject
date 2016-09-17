package com.niit.shoppingcart.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.model.Category;

@Repository
public interface CategoryDAO 
{   
	// category DAO will interact with repository
    // Declare all CRUD operations
	public boolean saveOrUpdate(Category category);//save catsegory domain obj to d/b
    // public boolean update(Category category);
	//public boolean delete(Category category);
	public String deleteRow(String id);
    public Category get(String id); // to access complete category
    //public List<Category> list(); // to display complete list
    public List<Category> getList();
    public Category getRowById(String id);
    public String update(Category category);

}

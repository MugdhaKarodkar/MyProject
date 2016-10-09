package com.niit.shoppingcart.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

@Repository
public interface CategoryDAO 
{   
	// category DAO will interact with repository
    // Declare all CRUD operations
	public boolean save(Category category);//save catsegory domain obj to d/b
    //public boolean update(Category category);
	//public boolean delete(Category category);
	public String deleteRow(String category_id);
    public Category get(String category_id); // to access complete category
    //public List<Category> list(); // to display complete list
    public List<Category> getList();
    public Category getRowById(String category_id);
    public String update(Category category);
    public Category getByName(String name);

}

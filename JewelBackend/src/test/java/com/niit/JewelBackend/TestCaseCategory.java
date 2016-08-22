package com.niit.JewelBackend;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class TestCaseCategory 
{
  
	@Autowired
    CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		category = (Category) context.getBean("category");
	}
	//@Test
	public void categoryListTestCase()
	{
		assertEquals("listProductTestCase", categoryDAO.list().size(), 6);
	}
	//@Test
	public void categoryAddTestcase()
	{
		category.setId("CG007");
		category.setName("categ6");
		category.setDescription("cat 6 desc");
		categoryDAO.saveorupdate(category);
		assertEquals("categoryAddTestCase", categoryDAO.saveorupdate(category), true);
	}
	@Test
	public void categoryGetTestCase()
	{
		categoryDAO.get("CG004");
		System.out.println(category.getDescription());
		System.out.println(category.getName());
		assertEquals(category.getName(),"CGName0011");
		
		
	}
	
}

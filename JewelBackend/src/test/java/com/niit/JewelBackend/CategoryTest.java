package com.niit.JewelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;
public class CategoryTest 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
        CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("CG0011");
		category.setName("CGName0011");
		category.setDescription("0011des");
		if (categoryDAO.saveorupdate(category) == true)
		{
			System.out.println("category successfully created");
		} 
		else
		{
			System.out.println("category not able to create");
		}
	}
}

package com.niit.JewelBackend;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;
public class TestCaseProduct {
	// To write test case for product, we need productDAO and product object
	@Autowired
	ProductDAO productDAO;

	@Autowired
	Product product;
	AnnotationConfigApplicationContext context;
	// u can write a method to initialize object or method

	@Before
	public void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
		product = (Product) context.getBean("product");
	}

	@Test // this is test case method
	public void deleteProductTestCase() {

		product.setId("MOB_007");
		boolean flag = productDAO.delete(product);
		// assertEquals("deleteProductTestCase",flag,false);
		assertEquals("deleteProductTestCase", productDAO.delete(product), flag);

	}

	// @Test
	public void addProductTestCase() {
		product.setId("MOB_0013");
		product.setName("Sovraob");
		product.setDescription("??? ");
		product.setPrice(20000);
		productDAO.saveorupdate(product);
		assertEquals("addProductTestCase", productDAO.saveorupdate(product), true);
	}

	// @Test
	public void listProductTestCase() {
		assertEquals("listProductTestCase", productDAO.list().size(), 3);
	}

	// @Test
	public void getProductTestCase() {

		assertEquals("getProductTestCase", productDAO.get("MOB_0014"), null);

	}
}

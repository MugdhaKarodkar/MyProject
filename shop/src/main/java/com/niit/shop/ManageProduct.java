/*package com.niit.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class ManageProduct
{
	@Autowired(required = true)
	CategoryDAO categoryDAO;

	@Autowired(required = true)
	SupplierDAO supplierDAO;
	
	@Autowired(required = true)
	CategoryDAO productDAO;
	
	private String path=
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String listproducts(Model model)
	{
		model.addAttribute("product",new Product());
		model.addAttribute("category",new Category());
		model.addAttribute("supplier",new Supplier());
		model.addAttribute("productList",this.productDAO.getList());
		model.addAttribute("supplierList",this.supplierDAO.getList());
		model.addAttribute("categoryList",this.categoryDAO.getList());
		return "product";
		
	}
	@RequestMapping(value="/Products",method=RequestMethod.POST)
	public String addProduct(@ModelAtrribute("product") Product product)
	{
		Category category=categoryDAO.getByName(product.getCategory().getName);
		Supplier supplier=supplierDAO.getByName(supplier.getSupplier().getName);
		product.setCategory(category);
		product.setSupplier(supplier);
		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());
		productDAO.saveOrUpdate(product);
	}

}
*/
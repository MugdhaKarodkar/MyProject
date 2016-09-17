package com.niit.shop;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shop.util.FileUtil;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class HomeController

{
	private String path = "d:/categoryimage/";

	@Autowired(required = true)
	CategoryDAO categoryDAO;

	@Autowired(required = true)
	SupplierDAO supplierDAO;

	@RequestMapping("/")    //Main Home
	public ModelAndView home() {
		System.out.println("In controller");
		ModelAndView mv = new ModelAndView("MainHome");
		return mv;
	}

	@RequestMapping("/Login")    //Signin
	public ModelAndView login() {
		System.out.println("Login page..................");
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("userClickedLogin", true);
		return mv;
	}

	@RequestMapping("/Signup")  //Registration
	public ModelAndView signup() 
	{
		System.out.println("Registration page..................");
		ModelAndView mv = new ModelAndView("Signup");
		mv.addObject("userClickedRegister", true);
		return mv;
	}

	@RequestMapping("/Home")    //Admin Home
	public ModelAndView home1() 
	{
		System.out.println("Home page..................");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("userClickedHome", true);
		return mv;
	}

	@RequestMapping("/gallery")
	public ModelAndView gallery() 
	{
		System.out.println("This is gallery");
		ModelAndView mv = new ModelAndView("gallery");
		mv.addObject("userClickedgallery", true);
		return mv;
	}

	@RequestMapping("/saveCategory")
	public ModelAndView save(@ModelAttribute("category") Category category, BindingResult result,
			@RequestParam("image") MultipartFile file, HttpServletRequest request) 
	{
		System.out.println("save");
		categoryDAO.saveOrUpdate(category);
		FileUtil.upload(path, file, category.getId() + ".jpg");
		return new ModelAndView("redirect:Category");
	}

	@RequestMapping("/Category")
	public ModelAndView addcategory() 
	{
		System.out.println("Add category");
		ModelAndView mv = new ModelAndView("Category");
		mv.addObject("category", new Category());
		mv.addObject("userClickedAddcategory", true);
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		return mv;
	}
    @RequestMapping("delete_category")
	public ModelAndView deleteUser(@RequestParam String id) {
		categoryDAO.deleteRow(id);
		return new ModelAndView("redirect:Category");
	}

	@RequestMapping("edit_category")
	public ModelAndView editCategory(@RequestParam String id, @ModelAttribute Category category) {
		ModelAndView mv = new ModelAndView("Category");
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		Category categoryObject = categoryDAO.getRowById(id);
		mv.addObject("categoryObject", categoryObject);
		return mv;
	}

	/*@RequestMapping("update_category")
	public ModelAndView updateCategory(@ModelAttribute Category category) {
		categoryDAO.update(category);
		return new ModelAndView("redirect:Category");
	}*/
	
	/*CATEGORY CRUD OPERATIONS ENDS*/

	/* SUPPLIER CRUD OPERATIONS STARTS*/
	@RequestMapping("/saveSupplier")
	public ModelAndView save(@ModelAttribute("supplier") Supplier supplier, BindingResult result,
			HttpServletRequest request) {
		System.out.println("save");
		supplierDAO.saveOrUpdate(supplier);
		return new ModelAndView("redirect:Supplier");
	}

	@RequestMapping("/Supplier")
	public ModelAndView addsupplier() {
		System.out.println("Add supplier");
		ModelAndView mv = new ModelAndView("Supplier");
		mv.addObject("supplier", new Supplier());
		mv.addObject("userClickedAddsupplier", true);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		return mv;
	}

	@RequestMapping("delete_supplier")
	public ModelAndView deleteSupplier(@RequestParam String id) {
		supplierDAO.deleteRow(id);
		return new ModelAndView("redirect:Supplier");
	}

	@RequestMapping("edit_supplier")
	public ModelAndView editSupplier(@RequestParam String id, @ModelAttribute Supplier supplier) {
		ModelAndView mv = new ModelAndView("Supplier");
		Supplier supplierObject = supplierDAO.getRowById(id);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		mv.addObject("supplierObject", supplierObject);
		return mv;
	}
	/* SUPPLIER CRUD OPERATIONS ENDS*/
}

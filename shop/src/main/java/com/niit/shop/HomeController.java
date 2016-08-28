package com.niit.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class HomeController {

	@Autowired(required = true) // whenever one navigate to homecontrooler
								// CategoryDAO obj should be injected
	CategoryDAO categoryDAO;

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("In controller");
		ModelAndView mv = new ModelAndView("MainHome");
		// mv.addObject("message","Thank you for visiting this URL");

		// get all categories and products

		/*
		 * List<Category> categoryList= categoryDAO.list();
		 * mv.addObject("categoryList",categoryList); System.out.println("Size"+
		 * categoryList);
		 */
		return mv;
	}

	@RequestMapping("/Login")
	public ModelAndView login() {
		System.out.println("Login page..................");
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("userClickedLogin", true);
		return mv;
	}

	@RequestMapping("/Signup")
	public ModelAndView signup() {
		System.out.println("Registration page..................");
		ModelAndView mv = new ModelAndView("Signup");
		mv.addObject("userClickedRegister", true);
		return mv;
	}

	@RequestMapping("/Home")
	public ModelAndView home1() {
		System.out.println("Home page..................");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("userClickedHome", true);
		return mv;
	}

	@RequestMapping("/gallery")
	public ModelAndView gallery() {
		System.out.println("This is gallery");
		ModelAndView mv = new ModelAndView("gallery");
		mv.addObject("userClickedgallery", true);
		return mv;
	}

	@RequestMapping("/saveCategory")
	public ModelAndView save(@ModelAttribute("category") Category category, BindingResult result) {
		System.out.println("save");
		categoryDAO.saveorupdate(category);
		return new ModelAndView("cataddsuccess");
	}

	@RequestMapping("/Category")
	public ModelAndView addcategory() {
		System.out.println("Add category");
		ModelAndView mv = new ModelAndView("Category");
		mv.addObject("category", new Category());
		mv.addObject("userClickedAddcategory", true);
		return mv;

	}

	@RequestMapping("list")
	public ModelAndView getList() {
		List<Category> categoryList = categoryDAO.getList();
		return new ModelAndView("list", "categoryList", categoryList);
	}

	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam String id) {
		categoryDAO.deleteRow(id);
		return new ModelAndView("redirect:list");
	}
	 @RequestMapping("edit")
	 public ModelAndView editUser(@RequestParam String id, @ModelAttribute Category category) {
	  Category categoryObject = categoryDAO.getRowById(id);
	  return new ModelAndView("edit", "categoryObject", categoryObject);
	 }
	 @RequestMapping("update")
	 public ModelAndView updateUser(@ModelAttribute Category category) {
	  categoryDAO.update(category);
	  return new ModelAndView("redirect:list");
	 }

}

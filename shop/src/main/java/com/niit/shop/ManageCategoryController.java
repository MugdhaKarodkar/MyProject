package com.niit.shop;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shop.util.FileUtil;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class ManageCategoryController 
{
	//private String path="d:/categoryimage/";
	//public String imagepath;
	
	private String path="c:/Users/user/workspace/shop/src/main/webapp/resources/ProjectImages/";
	public String imagepath;
	@Autowired(required = true)
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="saveCategory",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("category") Category category, BindingResult result,@RequestParam("image") MultipartFile file, HttpServletRequest request)
	{
		System.out.println("save");
		
		//imagepath=FileUtil.upload(path, file, category.getCategory_id() +".jpg");
		//category.setImagepath(imagepath);
		
		
		imagepath=FileUtil.upload(path, file, category.getCategory_id() +".jpg");
		String imgpath="resources/ProjectImages/"+category.getCategory_id()+".jpg";
		category.setImagepath(imgpath);
		
		
		categoryDAO.save(category);
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
	public ModelAndView deleteUser(@RequestParam String category_id) {
		categoryDAO.deleteRow(category_id);
		return new ModelAndView("redirect:Category");
	}

	@RequestMapping("edit_category")
	public ModelAndView editCategory(@RequestParam String category_id, @ModelAttribute Category category) {
		ModelAndView mv = new ModelAndView("category1");
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		Category categoryObject = categoryDAO.getRowById(category_id);
		mv.addObject("categoryObject", categoryObject);
		return mv;
	}

	@RequestMapping("update_category")
	public ModelAndView updateCategory(@ModelAttribute Category category,@RequestParam("image") MultipartFile file)
	{
		imagepath=FileUtil.upload(path, file, category.getCategory_id() +".jpg");
		String imgpath="resources/ProjectImages/"+category.getCategory_id()+".jpg";
		category.setImagepath(imgpath);
		categoryDAO.update(category);
		return new ModelAndView("redirect:Category");
	}
	
	
	@RequestMapping("/category1")
	public ModelAndView updatecategory() 
	{
		System.out.println("Add category");
		ModelAndView mv = new ModelAndView("category1");
		mv.addObject("category", new Category());
		mv.addObject("userClickedAddcategory", true);
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		return mv;
	}
	
	/*CATEGORY CRUD OPERATIONS ENDS*/
    
	
}

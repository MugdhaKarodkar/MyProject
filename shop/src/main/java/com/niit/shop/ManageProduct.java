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
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class ManageProduct 
{
	//private String path="d:/productimage/";
	//public String imagepath;
	
	private String path="c:/Users/user/workspace/shop/src/main/webapp/resources/ProjectImages/";
	public String imagepath;
	
	@Autowired(required = true)
	ProductDAO productDAO;
	
	@Autowired(required = true)
	CategoryDAO categoryDAO;
	
	@Autowired(required = true)
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/saveProduct",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("product") Product product, BindingResult result,@RequestParam("image") MultipartFile file, HttpServletRequest request)
	{
		System.out.println("save");
		//imagepath=FileUtil.upload(path, file, product.getId() +".jpg");
		//product.setImagepath(imagepath);
		
		imagepath=FileUtil.upload(path, file, product.getId() +".jpg");
		String imgpath="resources/ProjectImages/"+product.getId()+".jpg";
		product.setImagepath(imgpath);
		productDAO.saveOrUpdate(product);
		return new ModelAndView("redirect:Product");
		
	}

	@RequestMapping("/Product")
	public ModelAndView addproduct() 
	{
		System.out.println("Add Product");
		ModelAndView mv = new ModelAndView("Product");
		mv.addObject("product", new Product());
		mv.addObject("category", new Category());
		mv.addObject("supplier", new Supplier());
		mv.addObject("userClickedAddproduct", true);
		List<Product> productList = productDAO.getList();
		mv.addObject("productList", productList);
		List<Category> categoryList =categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		List<Supplier> supplierList =supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		return mv;
	}
    @RequestMapping("delete_product")
	public ModelAndView deleteProduct(@RequestParam String id) {
		productDAO.deleteRow(id);
		return new ModelAndView("redirect:Product");
	}

	@RequestMapping("edit_product")
	public ModelAndView editProduct(@RequestParam String id, @ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView("product1");
		List<Product> productList = productDAO.getList();
		mv.addObject("productList", productList);
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		Product productObject = productDAO.getRowById(id);
		mv.addObject("productObject", productObject);
		return mv;
	}
	@RequestMapping("update_product")
	public ModelAndView updateProduct(@ModelAttribute Product product,@RequestParam("image") MultipartFile file)
	{
		imagepath=FileUtil.upload(path, file, product.getId() +".jpg");
		String imgpath="resources/ProjectImages/"+product.getId()+".jpg";
		product.setImagepath(imgpath);
		productDAO.update(product);
		return new ModelAndView("redirect:Product");
	}
	
	
	@RequestMapping("/product1")
	public ModelAndView updateproduct() 
	{
		System.out.println("Update product");
		ModelAndView mv = new ModelAndView("product1");
		mv.addObject("product", new Product());
		mv.addObject("category", new Category());
		mv.addObject("supplier", new Supplier());
		mv.addObject("userClickedUpdateproduct", true);
		List<Product> productList = productDAO.getList();
		mv.addObject("productList", productList);
		List<Category> categoryList = categoryDAO.getList();
		mv.addObject("categoryList", categoryList);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		return mv;
	}
}

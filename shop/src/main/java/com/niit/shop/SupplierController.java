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
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class SupplierController 
{
	private String path="c:/Users/user/workspace/shop/src/main/webapp/resources/ProjectImages/";
	public String imagepath;
	
	@Autowired(required = true)
	SupplierDAO supplierDAO;
	
	/* SUPPLIER CRUD OPERATIONS STARTS*/
	@RequestMapping("/saveSupplier")
	public ModelAndView save(@ModelAttribute("supplier") Supplier supplier, BindingResult result,HttpServletRequest request,@RequestParam("image") MultipartFile file) {
		System.out.println("save");
		imagepath=FileUtil.upload(path, file, supplier.getSupplier_id() +".jpg");
		String imgpath="resources/ProjectImages/"+supplier.getSupplier_id()+".jpg";
		supplier.setImagepath(imgpath);
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
	public ModelAndView deleteSupplier(@RequestParam String supplier_id) {
		supplierDAO.deleteRow(supplier_id);
		return new ModelAndView("redirect:Supplier");
	}

	@RequestMapping("edit_supplier")
	public ModelAndView editSupplier(@RequestParam String supplier_id, @ModelAttribute Supplier supplier) {
		ModelAndView mv = new ModelAndView("supplier1");
		Supplier supplierObject = supplierDAO.getRowById(supplier_id);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		mv.addObject("supplierObject", supplierObject);
		return mv;
	}
	
	
	
	

	@RequestMapping("update_supplier")
	public ModelAndView updateSupplier(@ModelAttribute Supplier supplier,@RequestParam("image") MultipartFile file)
	{
		imagepath=FileUtil.upload(path, file, supplier.getSupplier_id() +".jpg");
		String imgpath="resources/ProjectImages/"+supplier.getSupplier_id()+".jpg";
		supplier.setImagepath(imgpath);
		supplierDAO.update(supplier);
		return new ModelAndView("redirect:Supplier");
	}
	
	
	@RequestMapping("/supplier1")
	public ModelAndView updatesupplier() 
	{
		System.out.println("Update supplier");
		ModelAndView mv = new ModelAndView("supplier1");
		mv.addObject("supplier", new Supplier());
		mv.addObject("userClickedupdatesupplier", true);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		return mv;
	}
	
	
	/* SUPPLIER CRUD OPERATIONS ENDS*/
    
}

/*package com.niit.shop;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class SupplierController 
{
	@Autowired(required = true)
	SupplierDAO supplierDAO;
	
	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("In controller");
		ModelAndView mv = new ModelAndView("MainHome");
		return mv;
	}
    @RequestMapping("/saveSupplier")
    public ModelAndView save(@ModelAttribute("supplier") Supplier supplier, BindingResult result,HttpServletRequest request) 
	{
        System.out.println("save");
		supplierDAO.save(supplier);
		return new ModelAndView("redirect:Supplier");
	}
    @RequestMapping("/Supplier")
	public ModelAndView addcategory()
	{
		System.out.println("Add supplier");
		ModelAndView mv = new ModelAndView("Supplier");
		mv.addObject("supplier", new Supplier());
		mv.addObject("userClickedAddsupplier", true);
		List<Supplier> supplierList = supplierDAO.getList();
		mv.addObject("supplierList", supplierList);
		return mv;
	}
    
}
*/
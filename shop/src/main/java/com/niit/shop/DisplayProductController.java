package com.niit.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;



@Controller
public class DisplayProductController
{
	
	
	@RequestMapping("Bangle") 
	public ModelAndView BangleCollection()
	{
		
		ModelAndView mv = new ModelAndView("Bangle");
		return mv;
	}
	@RequestMapping("Ring") 
	public ModelAndView RingCollection()
	{
		ModelAndView mv = new ModelAndView("Ring");
		return mv;
	}
	@RequestMapping("Necklace") 
	public ModelAndView NecklaceCollection()
	{
		ModelAndView mv = new ModelAndView("Necklace");
		return mv;
	}
}

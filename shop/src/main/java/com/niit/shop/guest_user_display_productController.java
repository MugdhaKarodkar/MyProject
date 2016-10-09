package com.niit.shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class guest_user_display_productController
{
	
	
	@RequestMapping("Bangle1") 
	public ModelAndView BangleCollection()
	{
		
		ModelAndView mv = new ModelAndView("Bangle1");
		return mv;
	}
	@RequestMapping("Ring1") 
	public ModelAndView RingCollection()
	{
		ModelAndView mv = new ModelAndView("Ring1");
		return mv;
	}
	@RequestMapping("Necklace1") 
	public ModelAndView NecklaceCollection()
	{
		ModelAndView mv = new ModelAndView("Necklace1");
		return mv;
	}
}

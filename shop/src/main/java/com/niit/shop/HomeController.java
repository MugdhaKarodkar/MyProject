package com.niit.shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("/")         //Main Home
	public ModelAndView home() 
	{
		System.out.println("In controller");
		ModelAndView mv = new ModelAndView("MainHome");
		return mv;
	}
   /* @RequestMapping("/Login")    //Signin
	public ModelAndView login() 
    {
		System.out.println("Login page..................");
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("userClickedLogin", true);
		return mv;
	}*/
    /*@RequestMapping("/Signup")  //Registration
	public ModelAndView signup() 
	{
		System.out.println("Registration page..................");
		ModelAndView mv = new ModelAndView("Signup");
		mv.addObject("userClickedRegister", true);
		return mv;
	}*/
    @RequestMapping("/Home")    //Admin Home
	public ModelAndView home1() 
	{
		System.out.println("Home page..................");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("userClickedHome", true);
		return mv;
	}
    @RequestMapping("/MainHome")    //Admin Home
   	public ModelAndView mainhome() 
   	{
   		System.out.println("Main Home page..................");
   		ModelAndView mv = new ModelAndView("MainHome");
   		mv.addObject("userClickedMainHome", true);
   		return mv;
   	}
    @RequestMapping("Logout")         //Main Home
	public ModelAndView logout() 
	{
		System.out.println("Logged out");
		ModelAndView mv = new ModelAndView("MainHome");
		return mv;
	}
    @RequestMapping("About_us")         //Main Home
   	public ModelAndView About_us() 
   	{
   		System.out.println("About us");
   		ModelAndView mv = new ModelAndView("About_us");
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
}

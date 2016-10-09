/*package com.niit.shop;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;

@Controller
  public class UserController
  {
	 @Autowired
	 UserDetailsDAO userDetailsDAO;
	 
	 @Autowired
	 UserDetails userDetails;
	 @RequestMapping("/Login")
	 public ModelAndView login (@RequestParam(value="id") String id,@RequestParam(value="password") String password,HttpSession session)
	 
	   ModelAndView mv=new ModelAndView("home");	 
	 }
  }

*/
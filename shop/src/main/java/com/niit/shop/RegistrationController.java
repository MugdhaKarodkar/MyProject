package com.niit.shop;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

@Controller
public class RegistrationController {
	@Autowired(required = true)
	UserDAO userDAO;

	@Autowired
	UserValidator userValidator;

	@RequestMapping("/Signup") // Registration
	public ModelAndView signup() {
		System.out.println("Registration page..................");
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("user", new User());
		mv.addObject("userClickedRegister", true);
		return mv;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String doLogin(@Valid User user, BindingResult result, Model model) {
		model.addAttribute("user", user);
		
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			user.setEnabled(false);
			return "Register";
		}
		user.setEnabled(true);
		userDAO.save(user);
		return "MainHome";
	}

	public UserValidator getUserValidator() {
		return userValidator;
	}

	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}

}

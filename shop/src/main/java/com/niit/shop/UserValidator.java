package com.niit.shop;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.niit.shoppingcart.model.User;

@Component
public class UserValidator implements Validator 
{
	public boolean supports(Class<?> clazz) 
	{
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) 
	{
		User user = (User) target;
		String password = user.getPassword();
		String confirm_password = user.getConfirm_password();
		if (!password.equals(confirm_password)) 
		{
			errors.rejectValue("password", "customer.password.missMatch");
		}
	}
}

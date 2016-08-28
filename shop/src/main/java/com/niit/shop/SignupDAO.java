package com.niit.shop;

public class SignupDAO
{
	//DAO(data acess obj
    public boolean isValidUser(String username,String email,String pwd,String conpwd)
    {
    	if(pwd.equals(conpwd) )
    	{
    		return true;
    	}
    	else
    	{
    	   return false;
    	}
    }
}

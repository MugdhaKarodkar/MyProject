package com.niit.shop;

public class LoginDAO
{
	//DAO(data access object)
    public boolean isValidUser(String id,String pwd)
    {
    	if(id.equals("niit") && pwd.equals("niit"))
    	{
    		return true;
    	}
    	else
    	{
    	   return false;
    	}
    }
}

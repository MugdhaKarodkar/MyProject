package com.niit.shoppingcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User 
{
	//@Id
    private String user_id;
	
	
	@NotEmpty
    private String name;
	
	@NotEmpty
    private String password;
	
	@NotEmpty
	private String confirm_password;
	
	@NotEmpty
	@Email
    private String mail;
	
	@NotEmpty
    private String contact;
	
	@NotEmpty
    private String address;
	
	private boolean enabled;
    
	@Id
	@Column(name="USER_ID")
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Column(name="CONFIRM_PASSWORD")
	public String getConfirm_password() 
	{
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) 
	{
		this.confirm_password = confirm_password;
	}
	@Column(name="NAME")
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Column(name="PASSWORD")
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	@Column(name="MAIL")
	public String getMail() 
	{
		return mail;
	}
	public void setMail(String mail) 
	{
		this.mail = mail;
	}
	@Column(name="CONTACT")
	public String getContact() 
	{
		return contact;
	}
	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	@Column(name="ADDRESS")
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
    
}

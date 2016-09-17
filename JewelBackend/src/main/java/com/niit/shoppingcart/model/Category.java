package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.executable.ValidateOnExecution;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity // not normal java class
@Table // @Table(name="Category")
@Component
public class Category {
	// id,name,description are fields in table
	@Id
	private String id;
	
	@Min(4)
	@Max(15)
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Max(30)
	private String description;
	
	@Transient
	private MultipartFile image;
	private Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public MultipartFile getImage() 
	{
		return image;
	}

	public void setImage(MultipartFile image) 
	{
		this.image = image;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

}

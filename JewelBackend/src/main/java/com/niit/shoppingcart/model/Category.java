package com.niit.shoppingcart.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity // not normal java class
@Table // @Table(name="Category")
@Component
public class Category {
	// id,name,description are fields in table
    @Id
	private String id;
	//@Min(5)
	//@Max(15)
	private String name;
	@NotEmpty
	private String description;

// @Transient //it is not going to store in database private String
	 //createdBy;
	
	 //@Transient
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}
	 //@Transient
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	 //@Transient
	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

}

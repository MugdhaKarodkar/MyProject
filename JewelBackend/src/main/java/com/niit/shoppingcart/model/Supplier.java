package com.niit.shoppingcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="SUPPLIER")
@Component

public class Supplier 
{
    @Id
    @NotEmpty
    @NotNull
    @Column(name="SUPPLIER_ID")
    private String supplier_id;
    
	@NotEmpty
	@NotNull
	@Column(name="NAME")
	private String name;
	
	
	@NotEmpty
	@NotNull
	@Column(name="ADDRESS")
	private String address;
	
	
	@Transient
	private MultipartFile image;

	@Column(name = "IMAGEPATH")
	private String imagepath;

	
	public String getName() 
	{
		return name;
	}
    public void setName(String name) 
	{
		this.name = name;
	}
   
    public String getAddress() 
	{
		return address;
	}
    public void setAddress(String address) 
	{
		this.address = address;
	}
    public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

}

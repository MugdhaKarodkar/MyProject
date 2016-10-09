package com.niit.shoppingcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="PRODUCT")
@Component
public class Product {
	@Id
	@Column(name="ID")
	@NotEmpty
	@NotNull
	private String id;
	
	@Column(name="NAME")
	@NotEmpty
	@NotNull
	private String name;
	
	@NotEmpty
	@NotNull
	@Column(name="DESCRIPTION")
	private String description;
	
	@NotEmpty
	@NotNull
	@Column(name="PRICE")
	private String price;

    @Transient
	private MultipartFile image;	
    @NotEmpty
	@NotNull
    @Column(name="IMAGEPATH")
	private String imagepath;
	
	@OneToOne
    @JoinColumn(name="category_id")
    private Category category;
	
    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	@OneToOne
    @JoinColumn(name="supplier_id")
    private Supplier supplier;
	
    public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getId() 
	{
		return id;
	}
   
	public void setId(String id) {
		this.id = id;
	}
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getImagepath() 
	{
		return imagepath;
	}

	public void setImagepath(String imagepath) 
	{
		this.imagepath = imagepath;
	}


}

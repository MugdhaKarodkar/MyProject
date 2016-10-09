package com.niit.shoppingcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="CATEGORY")
@Component
public class Category {
	@Id
	@Column(name = "CATEGORY_ID")
	private String category_id;

	@NotEmpty
	@Column(name = "NAME")
	private String name;

	@Transient
	private MultipartFile image;

	@Column(name = "IMAGEPATH")
	private String imagepath;

	@NotEmpty
	@Column(name = "DESCRIPTION")
	private String description;

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
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

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

}

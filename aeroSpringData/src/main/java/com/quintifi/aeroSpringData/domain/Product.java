package com.quintifi.aeroSpringData.domain;

import org.springframework.data.annotation.Id;

public class Product {

	/*
	 * Primary index for aerospike to load it in memory
	 */
	@Id 
	/*
	 * org.springframework.data.annotation.Id is currently used by Spring to support mapping for other 
	 * non relational persistence databases or frameworks that do not have a defined common persistence API 
	 * like JPA. So, it is normally used when dealing with other spring-data projects such as spring-data-mongodb, 
	 * spring-data-solr, etc.
	 * 
	 * 
	 * javax.persistence.Id is the annotation defined by JPA for all its implementations. Have in mind JPA only applies 
	 * for management of relational data.
	 * 
	 */
	private Integer id;
	private String productId;
	private String description;
	private String imageUrl;
	private double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
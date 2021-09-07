package com.ibm.ReviewService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	private int ProductId;

	@Column(name = "model")
	private String model;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@Column(name = "category")
	private String category;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "product_image")
	private byte[] productImage;

	public Product() {
	}

	public Product(int productId, String model, String description, double price, String category, String manufacturer,
			String quantity, byte[] productImage) {
		super();
		this.ProductId = productId;
		this.model = model;
		this.description = description;
		this.price = price;
		this.category = category;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.productImage = productImage;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		this.ProductId = productId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

}

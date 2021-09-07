package com.ibm.OrderService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordered_product_details")
public class OrderedProductDetails {
	@Id
	@Column(name = "ordered_product_id")
	private int orderedProductId;

	@Column(name = "order_id")
	private String orderId;

	@Column(name = "amount")
	private double amount;

	@Column(name = "quantity")
	private int quantity;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public OrderedProductDetails() {

	}

	public OrderedProductDetails(int orderedProductId, String orderId, double amount, int quantity, Product product) {
		super();
		this.orderedProductId = orderedProductId;
		this.orderId = orderId;
		this.amount = amount;
		this.quantity = quantity;
		this.product = product;
	}

	public int getOrderedProductId() {
		return orderedProductId;
	}

	public void setOrderedProductId(int orderedProductId) {
		this.orderedProductId = orderedProductId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;

	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}

package com.ibm.OrderService.Entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "order_details")
public class OrderDetails {

	@Id
	@Column(name = "order_id")
	private String orderId;

	@Column(name = "user_name")
	private String username;

	@Column(name = "payment_mode")
	private String paymentmode;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "order_time")
	private LocalTime orderTime;

	@Column(name = "status")
	private String status;

	@Column(name = "amount")
	private double amount;

	@OneToMany
	@JoinColumn(name = "order_id")
	private List<OrderedProductDetails> orderedProductsList;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub

	}

	public OrderDetails(String orderId, String username, String paymentmode, Address address, LocalDate orderDate,
			LocalTime orderTime, String status, double amount) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.paymentmode = paymentmode;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.status = status;
		this.amount = amount;
	}

	public List<OrderedProductDetails> getOrderedProductsList() {
		return orderedProductsList;
	}

	public void setOrderedProductsList(List<OrderedProductDetails> orderedProductsList) {
		this.orderedProductsList = orderedProductsList;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

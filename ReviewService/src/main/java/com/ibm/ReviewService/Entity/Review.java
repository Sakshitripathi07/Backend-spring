package com.ibm.ReviewService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "review")
public class Review {
	@Id
	@Column(name = "review_id")
	private int reviewId;
	@OneToOne
	@JoinColumn(name = "username")
	private UserDetails userdetails;

	@Column(name = "model")
	private String model;

	@Column(name = "description")
	private String description;

	@Column(name = "rating")
	private int rating;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;

	public Review() {
		super();
	}

	public Review(int reviewId, UserDetails userdetails, String model, String description, int rating,
			Product productId) {
		super();
		this.reviewId = reviewId;
		this.userdetails = userdetails;
		this.model = model;
		this.description = description;
		this.rating = rating;
		this.productId = productId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

}
package com.ibm.OrderService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
		@Id
		@Column(name="cart_id")
		private int cartId;
		
		//@OneToOne
		//@JoinColumn(name = "model")
		//private Product product;
		
		@Column(name="model")
		private String model;
		@Column(name="quantity")
		private int qty;

		@Column(name="username")
		private String userName;

		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cart(int cartId, Product product, int qty, String userName,String model) {
			super();
			this.cartId = cartId;
			//this.product = product;
			this.qty = qty;
			this.userName = userName;
			this.model=model;
		}

		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

//		public Product getProduct() {
//			return product;
//		}
//
//		public void setProduct(Product product) {
//			this.product = product;
//		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		
		

}

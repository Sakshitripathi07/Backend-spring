package com.ibm.OrderService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.OrderService.Entity.Cart;
import com.ibm.OrderService.Repository.CartRepository;
@Service
public class CartService {
	@Autowired
	private CartRepository repo;
	public boolean addToCart(Cart cart) {
		Cart c=repo.save(cart);
		return c!=null;
		
	}
	public List<Cart> getCart(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}

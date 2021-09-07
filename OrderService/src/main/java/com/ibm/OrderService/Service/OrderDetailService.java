package com.ibm.OrderService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.OrderService.Entity.OrderDetails;
import com.ibm.OrderService.Entity.OrderedProductDetails;
import com.ibm.OrderService.Repository.OrderDetailsRepository;


@Service
public class OrderDetailService {
	@Autowired
	private OrderDetailsRepository repo;

	public boolean addOrderDetails(OrderDetails orderdetails) {

		OrderDetails o = repo.save(orderdetails);
		return o != null;

	}

	public OrderDetails getOrderdetails(String orderId) {
		Optional<OrderDetails> od=repo.findById(orderId);
		if(od.isPresent()) {
			return od.get();
		}
		return null;
	}

	public void cancelOrder(String orderId) {
		repo.deleteById(orderId);
	}

	public boolean updateOrderDetails(OrderDetails orderdetails) {

		OrderDetails o = repo.save(orderdetails);
		return o != null;

	}

	public List<OrderDetails> getOrderDetailsByUsername(String username) {
		return repo.findByUsername(username);

	}
	
	
}

package com.ibm.OrderService.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.OrderService.Entity.OrderedProductDetails;
import com.ibm.OrderService.Repository.OrderedProductRepository;

@Service
public class OrderedProductDetailsService {
	
	 @Autowired
	 private OrderedProductRepository repo;

	public OrderedProductDetails getOrderProductdetails(int orderedProductId) {
			Optional<OrderedProductDetails> opd=repo.findById(orderedProductId);
			if(opd.isPresent()) {
				return opd.get();
			}
			return null;
		
	}
	public List<OrderedProductDetails> getOrderedProductDetailsByOrderId(String orderId) {
		List<OrderedProductDetails> op =repo.getByOrderId(orderId);
		return op;
	}

}

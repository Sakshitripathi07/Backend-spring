package com.ibm.OrderService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.OrderService.Entity.OrderedProductDetails;

public interface OrderedProductRepository extends JpaRepository<OrderedProductDetails, Integer> {

	List<OrderedProductDetails> getByOrderId(String orderId);

}

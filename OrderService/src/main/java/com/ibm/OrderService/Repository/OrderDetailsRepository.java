package com.ibm.OrderService.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.OrderService.Entity.OrderDetails;
import com.ibm.OrderService.Entity.OrderedProductDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,String>
{

	List<OrderDetails> findByUsername(String username);

	Optional<OrderDetails> findByUsernameAndOrderId(String username, String orderId);

	void deleteById(String orderId);


}

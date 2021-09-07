package com.ibm.OrderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.OrderService.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>  {

	Cart findByUserName(String userName);

	void deleteBycartId(String cartId);

}

package com.ibm.OrderService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.OrderService.Entity.OrderedProductDetails;
import com.ibm.OrderService.Service.OrderedProductDetailsService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })

public class OrderedProductsDetailsController {

	@Autowired
	private OrderedProductDetailsService service;

	@GetMapping(value = "/OrderedProductDetails/{orderedProductId}", produces = "application/json")
	public ResponseEntity<OrderedProductDetails> getOrderedProductdetails(@PathVariable int orderedProductId) {
		return new ResponseEntity<OrderedProductDetails>(service.getOrderProductdetails(orderedProductId), HttpStatus.OK);
	}
	@GetMapping(value = "/getOrderedProducts/{orderId}", produces = "application/json")
	public ResponseEntity<List<OrderedProductDetails>> getOrderedProductDetails(@PathVariable String orderId) {
		System.out.println("Hello.........");
		return new ResponseEntity<List<OrderedProductDetails>>(service.getOrderedProductDetailsByOrderId(orderId), HttpStatus.OK);

	}

}

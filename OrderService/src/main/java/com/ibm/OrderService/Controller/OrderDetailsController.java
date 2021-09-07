package com.ibm.OrderService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.OrderService.Entity.OrderDetails;
import com.ibm.OrderService.Service.OrderDetailService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })

public class OrderDetailsController {
	@Autowired
	private OrderDetailService service;

	@GetMapping(value = "/getOrder/orderId/{orderId}", produces = "application/json")
	public ResponseEntity<OrderDetails> getOrderDetails(@PathVariable String orderId) {
		return new ResponseEntity<OrderDetails>(service.getOrderdetails(orderId), HttpStatus.OK);
	}

	@GetMapping(value = "/getOrder/username/{username}", produces = "application/json")
	public ResponseEntity<List<OrderDetails>> getOrderDetailsByUserName(@PathVariable String username) {
		// System.out.println("Hello.........");
		return new ResponseEntity<List<OrderDetails>>(service.getOrderDetailsByUsername(username), HttpStatus.OK);

	}

//	@GetMapping(value = "/getOrder/{username}/orderId/{orderId}", produces = "application/json")
//	public ResponseEntity<OrderDetails> getOrderDetailsByUsernameAndOrderId(@PathVariable String username,
//			@PathVariable String orderId) {
//		return new ResponseEntity<OrderDetails>(service.getOrderDetailsByUsernameAndOrderId(username, orderId),
//				HttpStatus.OK);
//
//	}

	@PostMapping(value = "/addOrderdetails", consumes = "application/json")
	public HttpStatus addOrderdetails(@RequestBody OrderDetails orderdetails) {
		return service.addOrderDetails(orderdetails) ? HttpStatus.OK : HttpStatus.NOT_MODIFIED;
	}

	@DeleteMapping(value = "/{orderId}")
	public HttpStatus cancelOrder(@PathVariable String orderId) {
		service.cancelOrder(orderId);
		return HttpStatus.OK;
	}

	@PutMapping(value = "/updateOrder", consumes = "application/json")
	public HttpStatus updateOrderdetails(@RequestBody OrderDetails orderdetails) {
		return service.updateOrderDetails(orderdetails) ? HttpStatus.OK : HttpStatus.NOT_MODIFIED;
	}

}
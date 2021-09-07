package com.ibm.OrderService.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.OrderService.Entity.Cart;
import com.ibm.OrderService.Service.CartService;

@RestController
@CrossOrigin(origins= { "http://localhost:4200" })
public class CartController {
	@Autowired
	private CartService service;

	@PostMapping(value="/addToCart",consumes="application/json")
	public HttpStatus addToCart(@RequestBody Cart cart) {
		return service.addToCart(cart)?HttpStatus.OK:HttpStatus.NOT_FOUND;
	}
	@GetMapping(value="/getCart/{username}",produces="application/json")
	public ResponseEntity<List<Cart>> getCart(@PathVariable String username){
		return new ResponseEntity<List<Cart>>(service.getCart(username), HttpStatus.OK);

		
	}
}

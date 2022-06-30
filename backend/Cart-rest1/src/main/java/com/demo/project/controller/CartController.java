package com.demo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Cart;
import com.demo.project.service.CartService;



@RestController
@CrossOrigin({"http://localhost:4200","*"})
public class CartController {
	@Autowired
	private CartService cs;
	

	@PostMapping("/cart")
	public Cart addMenutoCart(@RequestBody Cart cart) {
		return cs.create(cart);
	}
	
	
	
}


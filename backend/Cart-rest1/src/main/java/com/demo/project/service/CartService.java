package com.demo.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Cart;
import com.demo.project.repository.CartRepository;



@Service
public class CartService {
	@Autowired
	private CartRepository cr;
	
	public Cart create(Cart cart) {
		
		return cr.save(cart);
	}
	
	
}
package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entities.Cart;
import com.demo.project.service.CartService;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cs;
	
	@PostMapping
	public Cart addToCart(@RequestBody Cart cart)
	{
		System.out.println(cart);
		return cs.create(cart);
	}
	
	@GetMapping
	public List<Cart> getAllCart()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Cart findCartById(@PathVariable("id") Integer id)
	{		
		return cs.read(id);
	}
	
	@PutMapping
	public Cart updateCart(@RequestBody Cart cart)
	{
		return cs.update(cart);
	}
	
	@DeleteMapping("/{id}")
	public Cart deleteCart(@PathVariable("id") Integer id)
	{
		return cs.delete(id);
	}
	
	@GetMapping("/customer/{cid}")
	public List<Cart> findCartByCid(@PathVariable("cid") Integer cid)
	{
		return cs.findCartByCustomerId(cid);
	}
}

package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Order;
import com.demo.project.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService os;
    
	@PostMapping("/order")
	public Order addOrder(Order order) 
	{
		return os.create(order);
	}
	@GetMapping("/order")
	public List<Order> retrieveOrder() 
	{
		return os.read();
	}	
	@GetMapping("/order/{id}")
	public Order findOrderbyId(@PathVariable("id")Integer id) 
	{
		return os.read(id);
	}	
	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order order) 
	{
		return os.update(order);
	}	
	@DeleteMapping("/order/{id}")
	public Order deleteOrder(@PathVariable("id")Integer id) 
	{
		return os.delete(id);
		}
}

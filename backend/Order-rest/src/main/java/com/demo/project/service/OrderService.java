package com.demo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Order;
import com.demo.project.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository or;
	
	public Order create(Order order) {
		return or.save(order);
	}
	public List<Order> read() {
		return or.findAll();
	}
	public Order read(Integer id) {
		Order o= null;
		Optional<Order> x= or.findById(id);
		if(x.isPresent())
		{
			o=x.get();
		}
		return o;
		
	}
	public Order update(Order order) {
		Order o= null;
		Optional<Order> x= or.findById(order.getId());
		if(x.isPresent())
		{
			o=order;
			or.save(order);
		}
		return o;	
		}
	public Order delete(Integer id) {
		Order order=read(id);
		if(order!=null) {
			or.delete(order);
		}
		return order;
	}



}

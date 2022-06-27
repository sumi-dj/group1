package com.demo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entities.Customer;
import com.demo.project.exception.CustomerAlreadyExists;
import com.demo.project.exception.CustomerNotFoundException;
import com.demo.project.repository.CustomerRepository;



@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) throws CustomerAlreadyExists, CustomerNotFoundException  {
		Customer temp=readbyEmail(customer.getEmail());
		if(temp==null)
		{
		  cr.save(customer);
		}
		else
		{
			throw new CustomerAlreadyExists("customer with id:"+customer.getEmail()+"already exists can not create");
			
		}
		return cr.save(customer);
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public Customer readbyEmail(String email) throws CustomerNotFoundException  {
		List<Customer> temp = cr.findByEmail(email);
		Customer c=null;
		if(temp.size()==1)
		{
			c=temp.get(0);
		}
		else
		{
			throw new CustomerNotFoundException("create new customer");
			
		}
		return c;
	}
	public Customer read(String name) {
		Optional<Customer> temp = cr.findByName(name);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public Customer update(Customer customer) {
		List<Customer> temp = cr.findByEmail(customer.getEmail());
		Customer c=null;
		if(temp.size()==1)
		{
			c=customer;
			cr.save(customer);
		}
		return c;
	}
	public Customer delete(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
			cr.delete(c);
		}
		return c;
	}
	
	
}



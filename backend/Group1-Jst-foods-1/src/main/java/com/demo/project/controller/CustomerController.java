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

import com.demo.project.entities.AuthRequest;
import com.demo.project.entities.Customer;
import com.demo.project.service.CustomerService;


@RestController
@RequestMapping("/customer")
 @CrossOrigin(origins = {"http://localhost:4200"}) 
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@PostMapping
	public Customer registerCustomer(@RequestBody Customer customer)
	{
		return cs.create(customer);
	}
	
	@GetMapping
	public List<Customer> findAllCustomers()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerId(@PathVariable("id") Integer id)
	{
		return cs.read(id);
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cs.update(customer);
	}

	@DeleteMapping("/{id}")
	public Customer deleteCustomer(@PathVariable("id") Integer id)
	{
		return cs.delete(id);
	}
	@PostMapping("/login")
	public Customer validateLogin(@RequestBody AuthRequest authRequest)
	{
		Integer id=authRequest.getId();
		Customer x = findCustomerId(id); 
		
		boolean status=false;
		if(x!=null)
		{
			if(x.getPassword().equals(authRequest.getPassword()))
			{
				//success
				status=true;
			}
		}
		if(!status)
		{
			x=null;
		}
		return x;
	}

	
}


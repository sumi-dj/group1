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

import com.demo.project.api.MenuApi;
import com.demo.project.entities.AuthRequest;
import com.demo.project.entities.Customer;
import com.demo.project.entities.Menu;
import com.demo.project.exception.CustomerAlreadyExists;
import com.demo.project.exception.CustomerNotFoundException;
import com.demo.project.service.CustomerService;



@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@Autowired
	private MenuApi ma;
	
	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id")Integer id)
	{
		return cs.read(id);
	}
//	@GetMapping("/{name}")
//	public Customer findCustomerByName(@PathVariable("name") String name)
//	{
//		return cs.read(name);
//	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return cs.create(customer);
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cs.update(customer);
	}
	
	@DeleteMapping("/{id}")
	public Customer deleteCustomer(@PathVariable("id")Integer id)
	{
		return cs.delete(id);
	}
	@PostMapping("/login")
	public Customer validateLogin(@RequestBody AuthRequest authRequest)
	{
		Integer id=authRequest.getId();
		Customer x = findCustomerById(id); 
		
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
   
	
	@GetMapping("/menu")
	public List<Menu> getAllMenus()
	{
		return ma.getAllMenus();
	}
}

package com.demo.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Menu menu;
	@ManyToOne
	private Customer customer;
	
	



	public Cart() {
		super();
	}


	public Cart(Integer id, Menu menu, Customer customer) {
		super();
		this.id = id;
		this.menu = menu;
		
		
	}


	public Cart(Menu menu, Customer customer) {
		super();
		this.menu = menu;
		this.customer = customer;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Menu getMenu() {
		return menu;
	}


	public void setMenu(Menu menu) {
		this.menu = menu;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", menu=" + menu + "]";
	}



	

	
	
}

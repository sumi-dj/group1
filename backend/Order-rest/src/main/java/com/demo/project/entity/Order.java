package com.demo.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Order_table")
@Entity
public class Order {
	@Id 
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer memu_id;
	private String price;
	private String address;
	private String payment;
	private String quantity;
	private String rating;

	
	public Order() {}

	public Order(Integer id, Integer memu_id, String price, String address, String payment) {
		super();
		this.id = id;
		this.memu_id = memu_id;
		this.price = price;
		this.address = address;
		this.payment = payment;
	}

	public Order(Integer id, Integer memu_id, String price, String address, String payment, String quantity,
			String rating) {
		super();
		this.id = id;
		this.memu_id = memu_id;
		this.price = price;
		this.address = address;
		this.payment = payment;
		this.quantity = quantity;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemu_id() {
		return memu_id;
	}

	public void setMemu_id(Integer memu_id) {
		this.memu_id = memu_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", memu_id=" + memu_id + ", price=" + price + ", address=" + address + ", payment="
				+ payment + ", quantity=" + quantity + ", rating=" + rating + "]";
	}

}

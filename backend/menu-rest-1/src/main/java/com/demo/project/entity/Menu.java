package com.demo.project.entity;



import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	
	private Integer  id;
	private String name;
	private String description;
	private Double price;
	private byte[] pics;
	
	public Menu(Integer id, String name, String description, Double price, byte[] pics) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.pics = pics;
	}
	public byte[] getPics() {
		return pics;
	}
	public void setPics(byte[] pics) {
		this.pics = pics;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Menu(Integer id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public Menu() {
		super();
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", pics="
				+ Arrays.toString(pics) + "]";
	}
	
	
}

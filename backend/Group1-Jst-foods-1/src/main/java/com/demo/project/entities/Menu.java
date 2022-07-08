package com.demo.project.entities;



import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  id;
	private String name;
	private String description;
	private Double price;
	private byte[] picture;
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
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", picture="
				+ Arrays.toString(picture) + "]";
	}
	public Menu(String name, String description, Double price, byte[] picture) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}
	public Menu(Integer id, String name, String description, Double price, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.picture = picture;
	}
	public Menu() {
		super();
	}
	
	
	
	
}

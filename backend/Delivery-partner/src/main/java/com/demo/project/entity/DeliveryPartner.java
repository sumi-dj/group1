package com.demo.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deliverypartner_table")

public class DeliveryPartner {
	  
		@Id
	
		private Integer id;
		private String name;
		private String location;
		private Float rating;
		private String suggestions;
		public DeliveryPartner() {
			super();
		}
		public DeliveryPartner(Integer id, String name, String location, Float rating, String suggestions) {
			super();
			this.id = id;
			this.name = name;
		this.location = location;
		this.rating = rating;
			this.suggestions = suggestions;
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
		public DeliveryPartner(String name, String location, Float rating, String suggestions) {
	super();
	this.name = name;
	this.location = location;
	this.rating = rating;
	this.suggestions = suggestions;
}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Float getRating() {
			return rating;
		}
		public void setRating(Float rating) {
			this.rating = rating;
		}
		public String getSuggestions() {
			return suggestions;
		}
		public void setSuggestions(String suggestions) {
			this.suggestions = suggestions;
		}
		@Override
		public String toString() {
			return "DeliveryPartner [id=" + id + ", name=" + name + ", location=" + location + ", rating=" + rating
					+ ", suggestions=" + suggestions + "]";
		}
}

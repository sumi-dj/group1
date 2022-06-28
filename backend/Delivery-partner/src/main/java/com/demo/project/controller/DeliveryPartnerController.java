package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.DeliveryPartner;
import com.demo.project.service.DeliveryPartnerService;

@RestController
@RequestMapping("/deliverypartner") 
public class DeliveryPartnerController {
	@Autowired
	private DeliveryPartnerService ds;
	@PostMapping
	public DeliveryPartner registerDeliveryPartner(@RequestBody DeliveryPartner deliverypartner) {
		return ds.create(deliverypartner);
	}
	@GetMapping
	public List<DeliveryPartner> findAllorders() {
		return ds.read();
	}
	@GetMapping("/deliverypartner/{id}")
	public DeliveryPartner FindDeliveryPartnerById(@PathVariable("id") Integer id) {
		return ds.read(id);
	}
	@PutMapping
	public DeliveryPartner updateDeliveryPartner(@RequestBody DeliveryPartner deliverypartner) {
		return ds.update(deliverypartner);
	}
	@DeleteMapping("/deliverypartner/{id}")
	public DeliveryPartner deleteDeliveryPartner(@PathVariable("id") Integer id) {
		return ds.delete(id);
	}

}

package com.demo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.DeliveryPartner;
import com.demo.project.repository.DeliveryPartnerRepository;

@Service
public class DeliveryPartnerService {
@Autowired
private DeliveryPartnerRepository dr;
	
	public DeliveryPartner create(DeliveryPartner deliverypartner) {
		return dr.save(deliverypartner);
	}
	public List<DeliveryPartner> read() {
		return dr.findAll();
	}
	public DeliveryPartner read(Integer id) {
		Optional<DeliveryPartner> temp = dr.findById(id);
		DeliveryPartner c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public DeliveryPartner update(DeliveryPartner deliverypartner) {
		Optional<DeliveryPartner> temp = dr.findById(deliverypartner.getId());
		DeliveryPartner c=null;
		if(temp.isPresent())
		{
			c=deliverypartner;
			dr.save(deliverypartner);
		}
		return c;
	}
	public DeliveryPartner delete(Integer id) {
		Optional<DeliveryPartner> temp = dr.findById(id);
		DeliveryPartner c=null;
		if(temp.isPresent())
		{
			c=temp.get();
			dr.delete(c);
		}
		return c;
	}
	
}



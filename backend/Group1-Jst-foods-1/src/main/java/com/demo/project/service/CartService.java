package com.demo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entities.Cart;
import com.demo.project.repository.CartRepository;



@Service
public class CartService {
	@Autowired
	private CartRepository cr;
	
	public Cart create(Cart cart) {
		return cr.save(cart);
	}
	public List<Cart> read() {
		return cr.findAll();
	}
	public Cart read(Integer id) {
		Optional<Cart> temp = cr.findById(id);
		Cart cart=null;
		if(temp.isPresent())
		{
			cart=temp.get();
		}
		return cart;
	}
	public Cart update(Cart cart) {
		return cr.save(cart);
	}
	public Cart delete(Integer id) {
		Cart temp = read(id);
		if(temp!=null)
		{
			cr.delete(temp);
		}
		return temp;
	}
	

	public List<Cart> findCartByCustomerId(Integer cid)
	{
		return cr.findCartByCid(cid);
	}
}

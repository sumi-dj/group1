package com.demo.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entities.Menu;
import com.demo.project.repository.MenuRepository;


@Service
public class MenuService {
	@Autowired
	private MenuRepository mr;
	
	public Menu create(Menu menu) {
		return mr.save(menu);
	}
	public List<Menu> read() {
		return mr.findAll();
	}
	public Menu read(Integer id) {
		 Optional<Menu> temp = mr.findById(id);
		 Menu m=null;
		 if(temp.isPresent())
		 {
			 m=temp.get();
		 }
		 return m;
	}
	public Menu update(Menu menu) {
		Menu m=read(menu.getId());
		if(m!=null)
		{
			mr.save(menu);
		}
		return m;
	}
	public Menu delete(Integer id) {
		Menu m=read(id);
		if(m!=null)
		{
			mr.delete(m);
		}
		return m;
	}
	
} 

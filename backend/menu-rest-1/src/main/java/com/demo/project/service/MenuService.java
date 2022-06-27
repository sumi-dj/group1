package com.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Menu;
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
		return mr.findById(id).get();
	}
	public Menu update(Menu menu) {
		return mr.save(menu);
	}
	public void delete(Menu menu) {
		mr.delete(menu);
	}
	
}

package com.demo.project.entity.service;

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
	
	
}

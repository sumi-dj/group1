package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Menu;
import com.demo.project.entity.service.MenuService;


@RestController
@CrossOrigin({"http://localhost:4200","*"})
public class MenuController {
	@Autowired
	private MenuService ms;
	

	@PostMapping("/menu")
	public Menu addMenu(@RequestBody Menu menu) {
		return ms.create(menu);
	}
	
	
	
}


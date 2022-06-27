package com.demo.project.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.project.entities.Menu;


@FeignClient(name="menu-api" ,url="http://localhost:5001/menu")
public interface MenuApi {
	@PostMapping
	public Menu addMenu(@RequestBody Menu menu);
	@GetMapping
	public List<Menu> getAllMenus() ;
	@GetMapping
	public Menu findMenuById(@PathVariable("id") Integer id) ;
	@PutMapping
	public Menu modifyMenu(@RequestBody Menu menu) ;
	@DeleteMapping
	public void removeMenu(@PathVariable("id") Integer id) ;
	
}




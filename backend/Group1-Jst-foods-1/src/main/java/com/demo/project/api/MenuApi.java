package com.demo.project.api;

import java.io.IOException;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.demo.project.entities.Menu;


@FeignClient(name="menu-api" ,url="http://localhost:5002/menu")
public interface MenuApi {
	@PostMapping
	public Menu addMenu(@RequestBody Menu menu);
	
	@PostMapping("/add")
	public Menu addMenu1(@RequestParam("name") String name,@RequestParam("description") String description, @RequestParam("price")Double price, @RequestParam("picture")MultipartFile file);
	
	@GetMapping
	public List<Menu> getAllMenus();
	
	
	@GetMapping("/{id}")
	public Menu findMenuById(@PathVariable("id") Integer id);
	
	
	@PutMapping
	public Menu updateProduct(@RequestBody Menu menu);
	
	
	@DeleteMapping
	public Menu deleteProduct(@PathVariable("id")Integer id);
	
}




package com.demo.project.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.project.entities.Menu;
import com.demo.project.service.MenuService;


@RestController
@RequestMapping("menu")
@CrossOrigin(origins = {"http://localhost:4200"})
public class MenuController {
	@Autowired
	private MenuService ms;
	
	@PostMapping
	public Menu addMenu(@RequestBody Menu menu)
	{
		return ms.create(menu);
	}
	
	@PostMapping("/add")
	public Menu addMenu1(@RequestParam("name") String name,@RequestParam("description") String description, @RequestParam("price")Double price, @RequestParam("picture")MultipartFile file) throws IOException
	{
		byte [] picture=file.getBytes();
		Menu menu=new Menu(name, description,price, picture);
		return ms.create(menu);
	}
	
	@GetMapping
	public List<Menu> getAllMenus()
	{
		return ms.read();
	}
	
	@GetMapping("/{id}")
	public Menu findMenuById(@PathVariable("id") Integer id)
	{
		return ms.read(id);
	}
	
	@PutMapping
	public Menu updateProduct(@RequestBody Menu menu)
	{
		return ms.update(menu);
	}
	
	@DeleteMapping
	public Menu deleteProduct(@PathVariable("id")Integer id)
	{
		return ms.delete(id);
	}
}

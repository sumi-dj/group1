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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.project.entity.Menu;
import com.demo.project.service.MenuService;



@RestController
@CrossOrigin({"http://localhost:4200","*"})
public class MenuController {
	@Autowired
	private MenuService ms;
	

	@PostMapping("/menu")
	public Menu addMenu(@RequestBody Menu menu) {
		return ms.create(menu);
	}
	/*
	 * @PostMapping("/menu") public Menu addMenu(@RequestParam("id") Long
	 * id,@RequestParam("name") String name,@RequestParam("price") Double
	 * price,@RequestParam("description") String
	 * description,@RequestParam("picture") MultipartFile picture) throws
	 * IOException { System.out.println(id); System.out.println(picture); byte[]
	 * pic=picture.getBytes(); Menu menu=new Menu(id,name,description,price,pic);
	 * menu.setPics(pic); return ms.create(menu);
	 * 
	 * }
	 */
	@GetMapping("/menu")
	public List<Menu> getAllMenus() {
		return ms.read();
	}
	@GetMapping("/menu/{id}")
	public Menu findMenuById(@PathVariable("id") Integer id) {
		return ms.read(id);
	}
	@PutMapping("/menu")
	public Menu modifyMenu(@RequestBody Menu menu) {
		return ms.update(menu); 
	}
	@DeleteMapping("/menu/{id}")
	public void removeMenu(@PathVariable("id") Integer id) {
		ms.delete(findMenuById(id));
	}
	
}


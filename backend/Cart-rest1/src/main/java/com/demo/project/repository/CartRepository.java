package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.Cart;



@Repository
public interface CartRepository extends JpaRepository<Cart, String>{

}


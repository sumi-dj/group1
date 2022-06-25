package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.Menu;



@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{

}


package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

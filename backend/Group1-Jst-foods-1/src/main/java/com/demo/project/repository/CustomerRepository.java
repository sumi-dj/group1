package com.demo.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByName(String name);

	Optional<Customer> findByEmail(String email);

}

package com.demo.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.project.entities.Cart;

import feign.Param;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{

	@Query("from Cart c where c.customer.id=:cid")
	public List<Cart> findCartByCid(@Param("cid")Integer cid);
}

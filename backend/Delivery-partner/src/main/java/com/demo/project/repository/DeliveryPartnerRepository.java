package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.DeliveryPartner;

@Repository
public interface DeliveryPartnerRepository extends JpaRepository <DeliveryPartner , Integer>{

}
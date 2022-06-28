package com.wipro.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.project.entity.DeliveryPartner;

@Repository
public interface DeliveryPartnerRepository extends JpaRepository <DeliveryPartner , Integer>{

}

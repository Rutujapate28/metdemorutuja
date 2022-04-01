package com.met.dapm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.met.dapm.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer,String> {
	
       
}

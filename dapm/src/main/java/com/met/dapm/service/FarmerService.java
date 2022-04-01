package com.met.dapm.service;

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.met.dapm.Dao.FarmerRepository;
import com.met.dapm.model.Farmer;

@Service
public class FarmerService {
	
	@Autowired
	FarmerRepository farmerrepository;
	
	
	@Transactional
	public void savefarmer(Farmer farmer) {
		
		farmerrepository.save(farmer);
	}
	
public Collection<Farmer> getAllFarmers(){
	
		
		System.out.println("employeeRepository: " + farmerrepository.getClass());
		
		return farmerrepository.findAll();
		
	}

	public Farmer  updatefarmer(Farmer farmer )
	{
	//Farmer f1 = farmerrepository.findByEmail(farmer.getEmailId());
		String id = farmer.getFarmerID();
		Farmer f1 =farmerrepository.findById(id).get();
	f1.setFirstname(farmer.getFirstname());
	f1.setLastname(farmer.getLastname());
	f1.setEmailId(farmer.getEmailId());
	f1.setGender(farmer.getGender());
	f1.setDob(farmer.getDob());
	f1.setAadharno(farmer.getAadharno());
	f1.setMobileno(farmer.getMobileno());
	f1.setLicencenumber(farmer.getLicencenumber());
	f1.setApmc(farmer.getApmc());
	f1.setBankname(farmer.getBankname());
	f1.setBranchname(farmer.getBranchname());
	f1.setAccounttype(farmer.getAccounttype());
	f1.setAccountnumber(farmer.getAccountnumber());
	f1.setRole(farmer.getRole());
	return farmerrepository.save(f1);
	
	
	}
	
	
	public void deletefarmer(Farmer farmer) {
		
		farmerrepository.deleteById(farmer.getFarmerID());
		System.out.println("farmer with id %s deleted" + farmer.getFarmerID());
		
	}
	 

}

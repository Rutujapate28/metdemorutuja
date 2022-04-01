package com.met.dapm.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.met.dapm.Dao.VendorRepository;
import com.met.dapm.model.Vendor;



@Service
public class VendorService {
	
	@Autowired
	VendorRepository vendorrepository;
	
	
	@Transactional
	public void savevendor(Vendor vendor) {
		
	vendorrepository.save(vendor);
	
	}
	
public Collection<Vendor> getAllVendors(){
	
		
		
		
		return vendorrepository.findAll();
		
	}

	public Vendor  updatevendor(Vendor vendor )
	{

	String id = vendor.getVendorID();
	Vendor f1 =vendorrepository.findById(id).get();
	f1.setFirstname(vendor.getFirstname());
	f1.setLastname(vendor.getLastname());
	f1.setEmailId(vendor.getEmailId());
	f1.setGender(vendor.getGender());
	f1.setDob(vendor.getDob());
	f1.setAadharno(vendor.getAadharno());
	f1.setMobileno(vendor.getMobileno());
	f1.setLicencenumber(vendor.getLicencenumber());
	f1.setApmc(vendor.getApmc());
	f1.setBankname(vendor.getBankname());
	f1.setBranchname(vendor.getBranchname());
	f1.setAccounttype(vendor.getAccounttype());
	f1.setAccountnumber(vendor.getAccountnumber());
	f1.setRole(vendor.getRole());
	return vendorrepository.save(f1);


	}
	
	
	public void deletevendor(Vendor vendor) {
		
		vendorrepository.deleteById(vendor.getVendorID());
		System.out.println("vendor with id %s deleted" + vendor.getVendorID());
		
	}

}

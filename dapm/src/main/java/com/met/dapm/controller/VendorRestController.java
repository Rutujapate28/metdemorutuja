package com.met.dapm.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.met.dapm.model.Vendor;
import com.met.dapm.service.VendorService;

@RestController
@RequestMapping("/vendor")
@CrossOrigin

public class VendorRestController {
	
	@Autowired
	VendorService vendorService;
	
	@GetMapping(value="getAllvendors", produces={MediaType.APPLICATION_JSON_VALUE})
	public Collection<Vendor> getAllVendors(){
		
		return vendorService.getAllVendors();
		
	}


	@PostMapping(value="savevendor", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Vendor saveVendor(@RequestBody Vendor vendor){
		
		
		vendorService.savevendor(vendor);
		
		return vendor;
		
	}
	
	@PutMapping(value="updatevendor", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Vendor updatevendor(@RequestBody Vendor vendor) {
		
		vendorService.updatevendor(vendor);
		return vendor;
		
	}
	
	
	@DeleteMapping(value="deletevendor", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deletevendor(@RequestBody Vendor vendor) {
		vendorService.deletevendor(vendor);
		
		
	}

}

package com.met.dapm.controller;

import org.springframework.http.MediaType;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.dapm.model.Farmer;
import com.met.dapm.service.FarmerService;

@RestController
@RequestMapping("/farmer")
@CrossOrigin
public class FarmerRestController {
	
	@Autowired
	FarmerService farmerService;
	
	@GetMapping(value="getAllfarmers", produces={MediaType.APPLICATION_JSON_VALUE})
	public Collection<Farmer> getAllFarmers(){
		
		return farmerService.getAllFarmers();
		
	}


	@PostMapping(value="savefarmer", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Farmer saveFarmer(@RequestBody Farmer farmer){
		
		
		farmerService.savefarmer(farmer);
		
		return farmer;
		
	}
	
	@PutMapping(value="updatefarmer", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Farmer updatefarmer(@RequestBody Farmer farmer) {
		
		farmerService.updatefarmer(farmer);
		return farmer;
		
	}
	
	
	@DeleteMapping(value="deletefarmer", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deletefarmer(@RequestBody Farmer farmer) {
		farmerService.deletefarmer(farmer);
		
		
	}
}

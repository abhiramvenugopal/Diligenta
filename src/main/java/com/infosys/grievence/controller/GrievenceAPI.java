package com.infosys.grievence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.infosys.grievence.dto.Grievencedto;
import com.infosys.grievence.service.GrievenceService;

@RestController
@CrossOrigin
public class GrievenceAPI {
	@Autowired
	GrievenceService grievenceService;
	
	@GetMapping(value = "/api/getgrievence/{id}")
	public Grievencedto getGrievence(@PathVariable("id") Integer id) {
		return grievenceService.getItem(id);
		
	}
	@PutMapping(value = "/api/putgrievence")
	public Integer putGrievence(@RequestBody Grievencedto grievencedto) {
		return grievenceService.putGrievence(grievencedto);
		
	}

}

package com.infosys.grievence.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.grievence.dto.Grievencedto;
import com.infosys.grievence.entity.GrievenceEntity;
import com.infosys.grievence.repository.DemoRepo;
@Service
public class GrievenceService {
	@Autowired
	DemoRepo demoRepo;
	public Grievencedto getItem(Integer id){
		Grievencedto grievencedto=null;
		Optional<GrievenceEntity> grievenceEntity=demoRepo.findById(id);
		if(grievenceEntity.isPresent()) {
			grievencedto=new Grievencedto();
			GrievenceEntity val=grievenceEntity.get();
			grievencedto.setId(val.getId());
			grievencedto.setName(val.getName());
			grievencedto.setDate(val.getDate());
			grievencedto.setStatement(val.getStatement());
			
		}
		return grievencedto;
		
	}
	
	public Integer putGrievence(Grievencedto grievencedto) {
		GrievenceEntity grievenceEntity=new GrievenceEntity();
		grievenceEntity.setName(grievencedto.getName());
		grievenceEntity.setStatement(grievencedto.getStatement());
		grievenceEntity.setDate(LocalDate.now());
		grievenceEntity=demoRepo.save(grievenceEntity);
		return grievenceEntity.getId();
		
	}

}

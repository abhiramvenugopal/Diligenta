package com.infosys.grievence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.grievence.entity.GrievenceEntity;
@Repository
public interface DemoRepo extends JpaRepository<GrievenceEntity, Integer>{

}

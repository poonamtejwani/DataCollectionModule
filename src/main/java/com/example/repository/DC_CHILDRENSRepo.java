package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DC_CASESEntity;
import com.example.entity.DC_CHILDRENSEntity;



public interface DC_CHILDRENSRepo extends JpaRepository<DC_CHILDRENSEntity, Serializable>{

	
	public List<DC_CHILDRENSEntity> findByCaseNum(Long caseNum);
}

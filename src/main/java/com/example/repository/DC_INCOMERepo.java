package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DC_INCOMEEntity;

public interface DC_INCOMERepo extends JpaRepository<DC_INCOMEEntity, Serializable>{

	public DC_INCOMEEntity findByCaseNum(Long caseNum);
}

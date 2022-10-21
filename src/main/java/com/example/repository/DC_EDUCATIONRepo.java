package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DC_EDUCATIONEntity;



public interface DC_EDUCATIONRepo extends JpaRepository<DC_EDUCATIONEntity, Serializable>{

	public DC_EDUCATIONEntity  findByCaseNum(Long caseNum);
}

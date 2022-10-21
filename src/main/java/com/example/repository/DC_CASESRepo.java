package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entity.DC_CASESEntity;

public interface DC_CASESRepo extends JpaRepository<DC_CASESEntity, Serializable> {
	
	public DC_CASESEntity findByAppId(Integer appId);

}

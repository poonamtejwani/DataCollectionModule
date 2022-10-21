package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PlanEntity;

public interface PlanRepo extends JpaRepository<PlanEntity, Serializable> {

}

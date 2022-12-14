package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="CITIZEN_APP")
public class CitizenAppEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer appId;
	private String fullname;
	
	private String email;
	private Long phno;
	
	private String gender;
	
	private Long ssn;
	
	private String stateName;
	
	private LocalDate dob;
	
	private LocalDate createdDate;
	
	private LocalDate  updateDate;
	
	@CreationTimestamp
	private String createdBy;
	
	@UpdateTimestamp
	private String updatedBy;
	
	
	
	


}

package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_EDUCATION")
public class DC_EDUCATIONEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eduId;
	
	private Integer caseNum;
	
	private String highestQualification;
	private Integer graduationYear;
	private String universityName;
	
	
	
}

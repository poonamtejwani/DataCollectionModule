package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DC_CHILDRENS {
	
	@Id
	private Integer childrenId;
	
	private Integer caseNum;
	
	private LocalDate dob;
	
	private Long ssn;
		
	}

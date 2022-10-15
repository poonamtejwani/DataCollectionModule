package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class DC_EDUCATION {
	
	
	private Integer eduId;
	
	private Integer caseNum;
	
	private String qualification;
	private LocalDate graduationYear;
	
	
}

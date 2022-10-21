package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_EDUCATION")
public class DC_EDUCATIONEntity {
	
	
	private Integer eduId;
	
	private Integer caseNum;
	
	private String qualification;
	private LocalDate graduationYear;
	
	
}

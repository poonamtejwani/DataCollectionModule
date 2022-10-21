package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CHILDRENS")
public class DC_CHILDRENSEntity {
	
	@Id
	@GeneratedValue
	private Integer childId;
	
	private LocalDate childdob;
	
	private Long childSsn;
	
	
		
	}

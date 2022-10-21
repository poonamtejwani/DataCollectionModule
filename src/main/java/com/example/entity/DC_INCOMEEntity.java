package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_INCOME")
public class DC_INCOMEEntity {
	
	@Id
	@GeneratedValue
	private Integer incomeId;
	
	private Long caseNum;
	
	private Double empIncome;
	
	private Double propertyIncome;
	
		
}

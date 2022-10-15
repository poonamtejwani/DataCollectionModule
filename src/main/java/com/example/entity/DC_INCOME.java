package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DC_INCOME {
	
	@Id
	private Integer incomeId;
	
	private Integer caseNum;
	
	private Integer empIncome;
	
	private Integer propertyIncome;
	
		
}

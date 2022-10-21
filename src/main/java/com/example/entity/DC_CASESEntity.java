package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CASES")
public class DC_CASESEntity {
	
	@Id
	@GeneratedValue
    private Long  caseNum;
	private Integer appId;
	private Integer planId;

}

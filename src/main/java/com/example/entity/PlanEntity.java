package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class PlanEntity {
	@Id
	private Integer planId;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	private LocalDate planStartDate;
	
	@Column(name="PlAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name="ACTIVE-w")
	private String activeSw;
	
	@Column(name="PLAN_CATEGORY_ID")
	private Integer planCategoryId;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Column(name="CREATED_DATE", updatable=false)
	@CreationTimestamp
	private LocalDate createDate ;
	
	@Column(name="UPDATE_DATE", insertable=false)
	@UpdateTimestamp
	private LocalDate updateDate;
}

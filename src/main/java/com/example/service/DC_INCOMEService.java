package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.entity.DC_INCOME;

public interface DC_INCOMEService {
	
	public DC_INCOME incomeDetails(Integer caseNumber);
	
	 public Map<Integer , String> kidsDetails(Integer caseNumber);
	 
	 public List<Object> getAllDetails();
	 

}

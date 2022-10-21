package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.binding.Child;
import com.example.binding.ChildRequest;
import com.example.binding.DCSummary;
import com.example.binding.Education;
import com.example.binding.Income;
import com.example.binding.PlanSelection;

public interface DcService {
	
	public Long loadCaseNum(Integer appId) ;
	
	public Map<Integer,String> getPlanNames();
	
	public Long savePlanSelection(PlanSelection planSelection);
	
	public Long saveIncomeData(Income income);
	
	public Long saveEducation(Education education) ;
	
	public Long saveChildren(ChildRequest request) ;
	
	public DCSummary getSummary(Long caseNum);
	
	
	
}

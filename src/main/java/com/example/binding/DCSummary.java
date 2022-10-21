package com.example.binding;

import java.util.List;

import lombok.Data;

@Data
public class DCSummary {
	
	private Income income;
	
	private Education education;
	
	private List<Child> childs;
	private String planNames;
	
	

}

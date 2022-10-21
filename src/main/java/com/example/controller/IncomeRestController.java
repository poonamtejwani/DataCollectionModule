package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Income;
import com.example.service.DcService;

@RestController
public class IncomeRestController {

	
	 private DcService service;
	 
	 @PostMapping("/income")
	 public ResponseEntity<Long> saveIncome(@RequestBody Income income){
		 Long caseNum = service.saveIncomeData(income);
		 return new ResponseEntity<Long>(caseNum , HttpStatus.OK);
		 
	 }
	 
}

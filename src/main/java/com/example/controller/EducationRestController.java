package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Education;
import com.example.service.DcService;

@RestController
public class EducationRestController {

	
	  public DcService service;
	  
	  public ResponseEntity<Long> saveEducation(@RequestBody Education education){
		  
		  Long caseNum= service.saveEducation(education);
		  
		  return new ResponseEntity<Long>(caseNum, HttpStatus.OK);
	  }
	  
}

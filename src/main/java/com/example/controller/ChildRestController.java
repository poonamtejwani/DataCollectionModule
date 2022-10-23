package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.ChildRequest;
import com.example.binding.DCSummary;
import com.example.service.DcService;

@RestController
public class ChildRestController {
     
	@Autowired
	 public DcService service;
	 
	 @PostMapping("/childrens")
	 public ResponseEntity<DCSummary> saveChilds(ChildRequest request){
		 Long caseNum= service.saveChildren(request);
		 
		 DCSummary  summary= service.getSummary(caseNum);
		 return new ResponseEntity<DCSummary>(summary ,HttpStatus.OK);
		 
	 }
	 
}

package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.PlanSelection;
import com.example.service.DcService;

@RestController
public class PlanSelectionRestController {

	private DcService service;
	
	@PostMapping("/plansel")
	public ResponseEntity<Long> planSelection(@RequestBody PlanSelection planSel){
	
		Long caseNum= service.savePlanSelection(planSel);
		return new ResponseEntity<Long>(caseNum , HttpStatus.OK);
		
	}
	
}

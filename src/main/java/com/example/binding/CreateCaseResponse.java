package com.example.binding;

import java.util.List;

import lombok.Data;

@Data
public class CreateCaseResponse {

	 private Long caseNum;
	 private List<String> planNames;
}

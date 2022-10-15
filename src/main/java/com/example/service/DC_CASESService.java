package com.example.service;

import java.util.Map;

public interface DC_CASESService {
	
	public boolean createCase(Integer appId);
	
	public Map<Integer , String> getPlanCategories();

}

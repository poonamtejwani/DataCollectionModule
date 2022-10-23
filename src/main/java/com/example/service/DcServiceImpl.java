package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.Child;
import com.example.binding.ChildRequest;
import com.example.binding.DCSummary;
import com.example.binding.Education;
import com.example.binding.Income;
import com.example.binding.PlanSelection;
import com.example.entity.CitizenAppEntity;
import com.example.entity.DC_CASESEntity;
import com.example.entity.DC_CHILDRENSEntity;
import com.example.entity.DC_EDUCATIONEntity;
import com.example.entity.DC_INCOMEEntity;
import com.example.entity.PlanEntity;
import com.example.repository.CitizenAppRepo;
import com.example.repository.DC_CASESRepo;
import com.example.repository.DC_CHILDRENSRepo;
import com.example.repository.DC_EDUCATIONRepo;
import com.example.repository.DC_INCOMERepo;
import com.example.repository.PlanRepo;

@Service
public class DcServiceImpl implements DcService {

	 @Autowired
	 CitizenAppRepo citizenAppRepo;
	 
	 @Autowired
	 DC_CASESRepo DccaseRepo;
	 
	 @Autowired
	 DC_CHILDRENSRepo childrenRepo ;
	 
	 @Autowired
	 DC_EDUCATIONRepo educationRepo;
	 
	 @Autowired
	 DC_INCOMERepo incomeRepo;
	 
	 @Autowired
	 PlanRepo planRepo;
	 	 
	 
	

	public Map<Integer ,String> getPlanNames() {
		
		List<PlanEntity>findAll = planRepo.findAll();
		Map<Integer ,String> plansMap= new HashMap();
		for(PlanEntity entity: findAll)
		{
			 plansMap.put(entity.getPlanId() , entity.getPlanName());
		}
		
		return plansMap;
	}

	

	public Long saveIncomeData(Income income) {
		    DC_INCOMEEntity entity = new DC_INCOMEEntity();
		    BeanUtils.copyProperties(income, entity);
		    
		    incomeRepo.save(entity);
		    return income.getCaseNum();
		    
	}

	public Long saveEducation(Education education) {
		     DC_EDUCATIONEntity entity= new DC_EDUCATIONEntity();
		     
		     BeanUtils.copyProperties(education, entity);
		     
		     educationRepo.save(entity);
		     
		     return education.getCaseNum();
	}

	public Long saveChildren(ChildRequest request) {
		
		List<Child> childs= request.getChilds();
		Long caseNum=request.getCaseNum();
		
		for(Child c : childs) {
			DC_CHILDRENSEntity entity= new DC_CHILDRENSEntity();
			BeanUtils.copyProperties(c, entity);
			entity.setCaseNum(caseNum);
			childrenRepo.save(entity);
		}
		return request.getCaseNum();
	}

	

	public DCSummary getSummary(Long caseNum) {
		String planName= "";
		
		DC_INCOMEEntity incomeEntity = incomeRepo.findByCaseNum(caseNum);
		DC_EDUCATIONEntity educationEntity = educationRepo.findByCaseNum(caseNum);
		List<DC_CHILDRENSEntity> childsEntity = childrenRepo.findByCaseNum(caseNum);
		 
		 Optional<DC_CASESEntity> dcCase = DccaseRepo.findById(caseNum);
		 if(dcCase.isPresent())
		 {
			 Integer planId = dcCase.get().getPlanId() ;
			 Optional<PlanEntity> plan = planRepo.findById(planId);
			 if(plan.isPresent())
			 {
				  planName = plan.get().getPlanName();
			 }
		 }
		DCSummary summary = new DCSummary();  // Set Summary data
		summary.setPlanNames(planName);
		
		Income income= new Income();
		BeanUtils.copyProperties(incomeEntity, income);	
		summary.setIncome(income);
		
		Education education = new Education();
		BeanUtils.copyProperties(educationEntity, education);
		summary.setEducation(education);
		
		
		List<Child> childs= new ArrayList<Child>();
		for(DC_CHILDRENSEntity  entity: childsEntity)
		{
			Child ch= new Child();
			BeanUtils.copyProperties(entity, ch);
			childs.add(ch);
		}
		
		summary.setChilds(childs);
		
		return summary;
		
	}

	public Long loadCaseNum(Integer appId) {
		
		Optional<CitizenAppEntity> app = citizenAppRepo.findById(appId);
		
		 if(app.isPresent())
		 {
		    DC_CASESEntity entity= new DC_CASESEntity();
		    entity.setAppId(appId);
		    entity = DccaseRepo.save(entity);
		
		    return entity.getCaseNum();
		 }
		return (long) 01;
	}



	public Long savePlanSelection(PlanSelection planSelection) {
		
		Optional<DC_CASESEntity> findById = DccaseRepo.findById(planSelection.getCaseNum());
		if(findById.isPresent()) {
			DC_CASESEntity dc_CASESEntity = findById.get();
			dc_CASESEntity.setPlanId(planSelection.getPlanId());
			
			DccaseRepo.save(dc_CASESEntity);
			return planSelection.getCaseNum();
		}
		return null;
	}

	 

}

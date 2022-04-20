package com.scalable.serviceone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scalable.serviceone.model.ServiceOneUserDetails;
import com.scalable.serviceone.repository.ServiceOneRspository;

@Service
public class ScalableOneService {

	@Autowired	
	ServiceOneRspository serviceOneRepo;
	public ServiceOneUserDetails getEmployee(final int empId) {
		return serviceOneRepo.findById(empId).get();  
	}
	
	public List<ServiceOneUserDetails> getAllEmployees(){
		List<ServiceOneUserDetails> users = new ArrayList<ServiceOneUserDetails>();  
		serviceOneRepo.findAll().forEach(user1 -> users.add(user1));  
		return users;  
	}
}

package com.scalable.serviceone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scalable.serviceone.model.ServiceOneUserDetails;
import com.scalable.serviceone.service.ScalableOneService;
@RestController
public class ServiceOneController {

	@Autowired
	private ScalableOneService userDetailsService;
	@GetMapping("/display/{empId}")
	public ServiceOneUserDetails getEmployee(@PathVariable int empId) {
		return userDetailsService.getEmployee(empId);
		
	}
	
	@GetMapping("/displayAll")
	public List<ServiceOneUserDetails> getAllEmployees(){
		return  userDetailsService.getAllEmployees();
		
	}
	
}

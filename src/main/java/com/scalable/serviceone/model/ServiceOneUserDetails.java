package com.scalable.serviceone.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ServiceOneUserDetails {
	@Id
	private int empId;
	private String strEmpName;
	private String strEmail;
	private String strLocation;
	
	public int getEmpId() {
		return empId;
	}

	public void setStrEmpId(int empId) {
		this.empId = empId;
	}

	public String getStrEmpName() {
		return strEmpName;
	}

	public void setStrEmpName(String strEmpName) {
		this.strEmpName = strEmpName;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrLocation() {
		return strLocation;
	}

	public void setStrLocation(String strLocation) {
		this.strLocation = strLocation;
	}

	public ServiceOneUserDetails() {
		super();
	}

	public ServiceOneUserDetails(int empId, String strEmpName, String strEmail, String strLocation) {
		super();
		this.empId = empId;
		this.strEmpName = strEmpName;
		this.strEmail = strEmail;
		this.strLocation = strLocation;
	}
}

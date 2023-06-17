package com.fullstack.model;

public class TechDepartment extends SuperDepartment {
	
	private String techInformation;

	public TechDepartment(String departmentName,String getTodaysWork, String getWorkDeadline,String techInformation) {
		super(departmentName,getTodaysWork,getWorkDeadline);
		this.techInformation = techInformation;
	}
	
	public String getTechStackInformation() {
		return this.techInformation;
	}

}

package com.fullstack.model;

public class HRDepartment extends SuperDepartment{
	
	private String activity;
	
	public HRDepartment(String departmentName,String getTodaysWork, String getWorkDeadline, String activity) {
		super(departmentName,getTodaysWork,getWorkDeadline);
		this.activity = activity;
	}

	public String doActivity() {
		return this.activity;
	}
	
	

}

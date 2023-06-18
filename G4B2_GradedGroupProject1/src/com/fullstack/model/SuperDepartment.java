package com.fullstack.model;

public class SuperDepartment {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private static String isTodayAHoliday = "Today is not a Holiday";
	
	
	public SuperDepartment() {
		this.departmentName = "Super Department";
		this.getTodaysWork = "No Work as of now";
		this.getWorkDeadline = "Nil";
	}
	
	public SuperDepartment(String departmentName,String getTodaysWork, String getWorkDeadline) {
		//super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
	}
		
	public String getDepartmentName() {
		return this.departmentName;
	}
	public String getGetTodaysWork() {
		return this.getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return this.getWorkDeadline;
	}
	
	public String getIsTodayAHoliday() { return SuperDepartment.isTodayAHoliday; }
	 
	
}

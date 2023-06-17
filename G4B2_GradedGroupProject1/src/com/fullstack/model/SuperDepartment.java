package com.fullstack.model;

public class SuperDepartment {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayAHoliday;
	
	
	public SuperDepartment() {
		this.departmentName = "Super Depatment";
		this.getTodaysWork = "No Work as of now";
		this.getWorkDeadline = "Nil";
		this.isTodayAHoliday = "Today is not a holiday";
	}
	
	public SuperDepartment(String departmentName,String getTodaysWork, String getWorkDeadline) {
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = "Today is not a Holiday";
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
	public String getIsTodayAHoliday() {
		return this.isTodayAHoliday;
	}
	
}

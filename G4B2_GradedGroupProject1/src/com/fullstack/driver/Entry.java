package com.fullstack.driver;

import com.fullstack.model.HRDepartment;
import com.fullstack.model.TechDepartment;
import com.fullstack.model.AdminDepartment;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment adminDept = new AdminDepartment("Admin Department", "Complete your documents Submission",
				"Complete by EOD");
		System.out.println("Welcome to " + adminDept.getDepartmentName());
		System.out.println(adminDept.getGetTodaysWork());
		System.out.println(adminDept.getGetWorkDeadline());
		System.out.println(adminDept.getIsTodayAHoliday());

		HRDepartment hrDept = new HRDepartment("HR Departmeent", "Fill today's timesheet and mark your attendance",
				"Complete by EOD", "team Lunch");
		System.out.println();
		System.out.println("Welcome to " + hrDept.getDepartmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getGetTodaysWork());
		System.out.println(hrDept.getGetWorkDeadline());
		System.out.println(hrDept.getIsTodayAHoliday());

		TechDepartment techDept = new TechDepartment("Tech Department", "Complete coding of Module 1","Complete by EOD","Core Java");
		System.out.println();
		System.out.println("Welcome to " + techDept.getDepartmentName());
		System.out.println(techDept.getGetTodaysWork());
		System.out.println(techDept.getGetWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.getIsTodayAHoliday());

	}

}

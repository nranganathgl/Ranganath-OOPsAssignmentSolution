package com.assignment.driver;

import com.assignment.service.AdminDepartment;
import com.assignment.service.HrDepartment;
import com.assignment.service.SuperDepartment;
import com.assignment.service.TechDepartment;

/*
* @author  Ranganath
* 
* This class is the Main driver class.
* This has to be run to list the functionalities
* of different departments.
*/
public class Main {

	public static void main(String[] args) {

		// To store the common welcome message of all departments
		String welcomeString = SuperDepartment.getWelcomestring();

		// object of AdminDepartment
		SuperDepartment adminDept = new AdminDepartment();

		// object of HrDepartment
		HrDepartment hrDept = new HrDepartment();

		// object of TechDepartment
		TechDepartment techDept = new TechDepartment();

		System.out.println(welcomeString + " " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println();

		System.out.println(welcomeString + " " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println();

		System.out.println(welcomeString + " " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}

}

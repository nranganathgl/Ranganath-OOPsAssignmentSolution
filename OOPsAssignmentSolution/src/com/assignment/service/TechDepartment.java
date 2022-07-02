package com.assignment.service;

/*
* @author  Ranganath
* 
* TechDepartment is the subclass of SuperDepartment
* This class is created to list the Tech department
* functionalities
*/
public class TechDepartment extends SuperDepartment {

	// returns department name
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	// returns the today's work
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	// returns work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// returns the stack of tech information
	public String getTechStackInformation() {
		return "Core Java";
	}
}

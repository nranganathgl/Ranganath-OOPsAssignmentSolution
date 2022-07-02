package com.assignment.service;

/*
* @author  Ranganath
* 
* AdminDepartment is the subclass of SuperDepartment
* This class is created to list the admin department
* functionalities
*/
public class AdminDepartment extends SuperDepartment {

	// returns department name
	@Override
	public String departmentName() {
		return "Admin Department";
	}

	// returns the today's work
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	// returns work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

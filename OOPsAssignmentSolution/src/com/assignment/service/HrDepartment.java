package com.assignment.service;

/*
* @author  Ranganath
* 
* HrDepartment is the subclass of SuperDepartment
* This class is created to list the HR department
* functionalities
*/
public class HrDepartment extends SuperDepartment {

	// returns department name
	@Override
	public String departmentName() {
		return "HR Department";
	}

	// returns the today's work
	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	// returns work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// returns the activity
	public String doActivity() {
		return "team Lunch";
	}
}

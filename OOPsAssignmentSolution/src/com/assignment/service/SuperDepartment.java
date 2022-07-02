package com.assignment.service;

/*
 * @author  Ranganath
 * This is the super class for Departments
 */
public class SuperDepartment {

	// constant field to store welcome message
	private static final String welcomeString = "Welcome to";

	// returns department name
	public String departmentName() {
		return "Super Department";
	}

	// returns the today's work
	public String getTodaysWork() {
		return "No Work as of now";
	}

	// returns work deadline
	public String getWorkDeadline() {
		return "Nil";
	}

	// returns whether today is holiday
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

	// static method returns the welcome message for
	// all departments
	public static String getWelcomestring() {
		return welcomeString;
	}

}

package com.springcore_standalone;

import java.util.Map;

public class Student {
	private Map<String, Integer> CourseFees;

	public Map<String, Integer> getCourseFees() {
		return CourseFees;
	}

	public void setCourseFees(Map<String, Integer> courseFees) {
		CourseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Student [CourseFees=" + CourseFees + "]";
	}
	
	

}

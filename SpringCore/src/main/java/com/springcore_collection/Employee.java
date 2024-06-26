package com.springcore_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String EmpName;
	private List<String> PhoneNums;
	private Set<String> Addresses;
	private Map<String,String> Courses;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhoneNums() {
		return PhoneNums;
	}
	public void setPhoneNums(List<String> phoneNums) {
		PhoneNums = phoneNums;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Employee(String empName, List<String> phoneNums, Set<String> addresses, Map<String, String> courses) {
		super();
		EmpName = empName;
		PhoneNums = phoneNums;
		Addresses = addresses;
		Courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

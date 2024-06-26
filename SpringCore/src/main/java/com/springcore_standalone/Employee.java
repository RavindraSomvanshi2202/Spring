package com.springcore_standalone;

import java.util.Set;

public class Employee {
	private Set<String> EmpId;

	public Set<String> getEmpId() {
		return EmpId;
	}

	public void setEmpId(Set<String> empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + "]";
	}
	
	
}

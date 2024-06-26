package com.springcore_autowiring_annotation;

public class Info {
	private String empName;
	private int empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Info [empName=" + empName + ", empId=" + empId + "]";
	}
	
}

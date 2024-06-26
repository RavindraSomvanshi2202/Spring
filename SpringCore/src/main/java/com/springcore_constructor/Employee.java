package com.springcore_constructor;

public class Employee {
	
	private String empName;
	private String empAdress;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public Employee(String empName, String empAdress) {
		this.empName = empName;
		this.empAdress = empAdress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAdress=" + empAdress + "]";
	}
	
	

}

package com.springcore_autowiring;

public class Employee3 {
	private Work work;

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}
	
	@Override
	public String toString() {
		return "Employee3 [work=" + work + "]";
	}

	public Employee3(Work work) {
		super();
		this.work = work;
	}

	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}

}

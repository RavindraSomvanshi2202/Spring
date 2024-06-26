package com.springcore_autowiring;

public class Employee2 {
	private Info info;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(Info info) {
		super();
		this.info = info;
	}

	@Override
	public String toString() {
		return "Employee2 [info=" + info + "]";
	}
	
	
}

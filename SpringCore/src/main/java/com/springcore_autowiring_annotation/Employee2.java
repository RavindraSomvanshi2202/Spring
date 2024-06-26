package com.springcore_autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee2 {
	private Info info;

	public Info getInfo() {
		return info;
	}
	
	@Autowired
	public void setInfo(Info info) {
		this.info = info;
		System.out.println("Setter Method Annotation");
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

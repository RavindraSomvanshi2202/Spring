package com.springcore_SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Person {
	@Value("#{22022001}")
	private int dob;

	public int getDob() {
		return dob;
	}

	public void setAddress(int dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [DOB=" + dob + "]";
	}
	

}

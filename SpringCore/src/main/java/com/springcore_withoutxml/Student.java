package com.springcore_withoutxml;

public class Student {
	
	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.Display();
		System.out.println("I am Reading Book");
	}

}

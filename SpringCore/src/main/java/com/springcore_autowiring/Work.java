package com.springcore_autowiring;

public class Work {
	private String designation;
	private String language;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Work(String designation, String language) {
		super();
		this.designation = designation;
		this.language = language;
	}
	@Override
	public String toString() {
		return "Work [designation=" + designation + ", language=" + language + "]";
	}
	
	
}

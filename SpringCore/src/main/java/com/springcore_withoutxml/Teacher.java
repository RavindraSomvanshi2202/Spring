package com.springcore_withoutxml;

public class Teacher {
	
	private Pepsi Pepsi;
	
	
	public Teacher(Pepsi getPepsi) {
		super();
		this.Pepsi = getPepsi;
	}


	public Pepsi getPepsi() {
		return Pepsi;
	}


	public void setPepsi(Pepsi getPepsi) {
		this.Pepsi = getPepsi;
	}


	public void getTeacher() {
		this.Pepsi.getPepsi();
		System.out.println("I am a Teacher");
	}

}

package com.springcore_stereo_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Apurva Somvanshi")
	private String Name;
	@Value("1922")
	private int studentId;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", studentId=" + studentId + "]";
	}
	
	
	

	

}

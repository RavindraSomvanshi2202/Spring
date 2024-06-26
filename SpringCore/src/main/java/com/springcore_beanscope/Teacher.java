package com.springcore_beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ab")
public class Teacher {
	@Value("1922")
	private String teacherID;

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + "]";
	}
	

}

package com.springcore_withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = con.getBean("temp2",Student.class);
		System.out.println(student);
		student.study();
	}

}

package com.springcore_withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig2.class);
		Teacher t1 = con.getBean("getTeacher",Teacher.class);
		System.out.println(t1);
		t1.getTeacher();
	}

}

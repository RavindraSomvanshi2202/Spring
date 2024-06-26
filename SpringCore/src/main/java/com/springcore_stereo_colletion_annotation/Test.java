package com.springcore_stereo_colletion_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore_stereo_colletion_annotation/stereocollection_config.xml");
		Student s1 = con.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println(s1.getNames().getClass().getName());
		
	}

}

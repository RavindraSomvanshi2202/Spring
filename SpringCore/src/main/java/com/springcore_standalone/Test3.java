package com.springcore_standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_standalone/map_config.xml");
		Student s1 = (Student) context.getBean("s1");
		System.out.println(s1);
		System.out.println(s1.getCourseFees().getClass().getName());
	}

}

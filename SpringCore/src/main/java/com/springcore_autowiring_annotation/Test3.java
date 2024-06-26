package com.springcore_autowiring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_autowiring_annotation/constructor_annotation.xml");
		Employee3 emp3 = context.getBean("emp3", Employee3.class);
		System.out.println(emp3);
	}

}

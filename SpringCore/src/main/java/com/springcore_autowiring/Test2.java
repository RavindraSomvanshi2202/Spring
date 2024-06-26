package com.springcore_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_autowiring/config_byType.xml");
		Employee2 emp2 = context.getBean("emp2",Employee2.class);
		System.out.println(emp2);
	}

}

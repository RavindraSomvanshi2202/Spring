package com.springcore_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_autowiring/config_byName.xml");
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}

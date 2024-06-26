package com.springcore_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_autowiring/config_byConstructor.xml");
		Employee3 emp3 = context.getBean("emp3", Employee3.class);
		System.out.println(emp3);
	}

}

package com.springcore_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_lifecycle/config_interface.xml");
		Pepsi p1 = (Pepsi) context.getBean("pepsi");
		System.out.println(p1);
		context.registerShutdownHook();

	}

}

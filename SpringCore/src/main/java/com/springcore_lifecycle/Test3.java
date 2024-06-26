package com.springcore_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_lifecycle/config_annotation.xml");
		FrechFries ff = (FrechFries) context.getBean("ff");
		System.out.println(ff);
		context.registerShutdownHook();

	}

}

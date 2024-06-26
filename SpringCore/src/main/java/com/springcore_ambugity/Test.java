package com.springcore_ambugity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_ambugity/config.xml");
		Addition add = (Addition) context.getBean("add");
		add.dosum();
	}

}

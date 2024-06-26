package com.springcore_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_lifecycle/config_xml.xml");
		Samosa s1 = (Samosa) context.getBean("samosa");
		System.out.println(s1);
		
		context.registerShutdownHook();
	}

}

package com.springcore_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_constructor/config.xml");
		Person pr = (Person) context.getBean("person");
		System.out.println(pr);

	}

}

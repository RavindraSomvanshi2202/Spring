package com.springcore_booleantype_SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore_booleantype_SpEL/booleantype_config.xml");
		Person p1 = con.getBean("person",Person.class);
		System.out.println(p1);
	}

}

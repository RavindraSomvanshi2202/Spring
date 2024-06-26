package com.springcore_standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_standalone/list_Config.xml");
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
	}

}

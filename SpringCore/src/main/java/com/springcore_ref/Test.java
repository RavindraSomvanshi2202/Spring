package com.springcore_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore_ref/config.xml");
		A temp = (A) contex.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp);

	}

}

package com.springcore_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore_ref/config_ref.xml");
		Parent p = (Parent) context.getBean("parent");
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.getB().getT());
		System.out.println(p);
	}

}

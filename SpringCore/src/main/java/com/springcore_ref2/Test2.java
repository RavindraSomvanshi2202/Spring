package com.springcore_ref2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_ref2/newconfig.xml");
		R temp2 = (R) context.getBean("ref");
		System.out.println(temp2.getP());
		System.out.println(temp2.getObj().getQ());
		System.out.println(temp2);
	}

}

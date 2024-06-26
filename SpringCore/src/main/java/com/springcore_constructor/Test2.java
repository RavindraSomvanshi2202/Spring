package com.springcore_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_constructor/empconfig.xml");
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1);

	}

}




  


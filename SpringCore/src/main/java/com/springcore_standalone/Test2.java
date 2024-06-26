package com.springcore_standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_standalone/set_Config.xml");
        Employee emp1 = context.getBean("empid",Employee.class);
        System.out.println(emp1);
        System.out.println(emp1.getEmpId().getClass().getName());
	}
}

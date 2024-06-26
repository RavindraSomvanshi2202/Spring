package com.springcore_collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTypeInjection {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore_collection/config.xml");
		Employee emp = (Employee) context.getBean("Employee");
		
		System.out.println("EMpName: "+emp.getEmpName());
		System.out.println("Emp PhoneNums: "+emp.getPhoneNums());
		System.out.println("Emp Addresses: "+emp.getAddresses());
		System.out.println("Emp Courses: "+emp.getCourses());
	}
}

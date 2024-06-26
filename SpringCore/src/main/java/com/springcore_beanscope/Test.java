package com.springcore_beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore_beanscope/scopeannotation_config.xml");
		Student s1 = context.getBean("ob",Student.class);
		Student s2 = context.getBean("ob",Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}

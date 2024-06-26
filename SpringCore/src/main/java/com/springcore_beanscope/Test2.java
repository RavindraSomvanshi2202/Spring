package com.springcore_beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore_beanscope/scopeXml_config.xml");
		Teacher t1 = context.getBean("t1",Teacher.class);
		Teacher t2 = context.getBean("t1",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}

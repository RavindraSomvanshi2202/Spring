package com.springcore_method_variable_invoke;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore_method_variable_invoke/invoke_config.xml");
		Person p1 = con.getBean("ob",Person.class);
		System.out.println(p1);
		
	   SpelExpressionParser temp = new SpelExpressionParser();
	   Expression temp1 = temp.parseExpression("19052002");
	   System.out.println(temp1.getValue());
	   
	}

}

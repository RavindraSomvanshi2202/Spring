package com.springcore_Dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore_Dependency_Injection/config.xml");
        Student student = (Student) contex.getBean("Student1");
        System.out.println(student);
    }
}

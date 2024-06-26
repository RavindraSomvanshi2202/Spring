package com.springcore_withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	public Samosa getSamosa() {
		return new Samosa();
	}
	
// We Can use this names for get a bean. / we can use getstudent
	@Bean(name = {"temp" , "temp2"}) 
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}

}

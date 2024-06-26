package com.springcore_withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig2 {
	
	public Pepsi getPepsi() {
		return new Pepsi();
	}
	
	@Bean
	public Teacher getTeacher() {
		Teacher teacher = new Teacher(getPepsi());
		return teacher;
	}

}

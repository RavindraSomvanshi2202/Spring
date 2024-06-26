package com.springcore_method_variable_invoke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Person {
	@Value("#{new java.lang.String('Apurva Mahajan')}")
	private String name;
	
	@Value("#{ T(java.lang.Math).sqrt('144')}")
	private double y;
	
	@Value("#{T(java.lang.Math).PI}")
	private double Pi;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getPi() {
		return Pi;
	}
	public void setPi(double pi) {
		Pi = pi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", y=" + y + ", Pi=" + Pi + "]";
	}
	
	
	

}

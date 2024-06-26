package com.springcore_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FrechFries {
	private  double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FrechFries() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FrechFries [price=" + price + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("Start init() Method");
	}
	
	@PreDestroy
	public void End()
	{
		System.out.println("Start destroy() Method");
	}
	

}

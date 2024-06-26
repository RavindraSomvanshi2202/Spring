package com.springcore_lifecycle;

public class Samosa {
	private int Price;

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price");
		Price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [Price=" + Price + "]";
	}
	
	public void Start() {
		System.out.println("Start init() Method");
	}
	
	public void End() {
		System.out.println("Start destroy() Method");
	}
	
	

}

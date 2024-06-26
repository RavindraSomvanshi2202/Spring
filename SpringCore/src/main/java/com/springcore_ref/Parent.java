package com.springcore_ref;

public class Parent {
	
	private int x;
	private double y;
	private Child b;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Child getB() {
		return b;
	}
	public void setB(Child b) {
		this.b = b;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + "]";
	}
	
	

}

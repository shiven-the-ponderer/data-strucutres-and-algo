package com.shiven.interview.spring.beanfactory;

public class Triangle {

	private String type;
	
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(this.type+" triangle draw");
	}
}

package com.shiven.threads.basic;

public class ExtendTestDemo extends TestDemo{
	
	@Override
	public void drive(){
		System.out.println("not hello");
	}
	
	public static void main(String[] args) {
		ExtendTestDemo extendTestDemo = new ExtendTestDemo();
		extendTestDemo.drive();
	}
}

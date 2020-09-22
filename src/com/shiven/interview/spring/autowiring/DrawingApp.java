package com.shiven.interview.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangleAutoConstructor");
		System.out.println(triangle.getPointAuto1().getX());
		System.out.println(triangle.getPointAuto2().getX());
	}

}

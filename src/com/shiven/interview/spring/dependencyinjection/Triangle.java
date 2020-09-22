package com.shiven.interview.spring.dependencyinjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle  implements ApplicationContextAware{

	private Point point1;
	private Point point2;
	ApplicationContext applicationContext;
	
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public void draw() {
		System.out.println("point 1"+"is: "+point1.getX()+","+point1.getY()+" and point 2"+" is: "+point2.getX()+","+point2.getY());
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		//this.point1 = (Point) context.getBean("point1");
		applicationContext = context;
		
	}
}

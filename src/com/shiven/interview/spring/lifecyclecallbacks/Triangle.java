package com.shiven.interview.spring.lifecyclecallbacks;

import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean{

	private Point point1;
	private Point point2;
	
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
	public void afterPropertiesSet() throws Exception {
		System.out.println("i will be called first");
		
	}
}

package com.shiven.interview.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle {
	
	//@Autowired
	//@Qualifier("pointAuto1x")
	private Point pointAuto1;

	//@Autowired
	//@Qualifier("pointAuto2y")
	private Point pointAuto2;
	
	
	//for setter injection.
	@Autowired
	public void setPointAuto1(Point pointAuto1) {
		this.pointAuto1 = pointAuto1;
	}
	
	public void setPointAuto2(Point pointAuto2) {
		this.pointAuto2 = pointAuto2;
	}

	public Point getPointAuto1() {
		return pointAuto1;
	}

	public Point getPointAuto2() {
		return pointAuto2;
	}
	
	//@Autowired
	public Triangle(@Qualifier("pointAuto1")Point point1,@Qualifier("pointAuto2")Point point2) {
		this.pointAuto1 = point1;
		this.pointAuto2 = point2;
	}
	
	public Triangle() {
		
	}
	
	/*@Autowired
	public Triangle(@Qualifier("pointAuto2")Point point1) {
		this.pointAuto1 = point1;
	}*/
	
	
	
}

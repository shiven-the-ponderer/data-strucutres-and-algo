package com.shiven.interview.questions.collections;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsMain {
	
	public static void main(String[] args) {
		Apple apple1 = new Apple("green");
		Apple apple2 = new Apple("red");
		
		Map<Apple,Integer> map = new HashMap<Apple,Integer>();
		map.put(apple1, 10);
		map.put(apple2, 20);
		
		System.out.println(map.get(apple1));
		System.out.println(map.get(new Apple("green")));
	}

}

package com.shiven.jvm.internals;

public class Subclass extends Superclass{
	
	static final int STATIC_FINAL = 47;
	static final int STATIC_FINAL2 = (int) (Math.random()*5);
	//this gets executed third
	static {
		System.out.println("subclass :: static initializer");
	}
	
	{
		System.out.println("subclass :: notstatic init");
	}
	
	//this gets executed sixth
	public Subclass() {
		System.out.println("subclass :: constructor");
	}
}

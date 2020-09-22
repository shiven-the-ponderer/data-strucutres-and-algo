package com.shiven.jvm.internals;

public class ClassInitializationDemo {
	
	//this gets executed first
	static {
		System.out.println("class initialization demo :: static initializer");
	}
	
	//this is not getting executed
	{
		System.out.println("class initialization demo :: instance initializer");
	}
	
	public static void main(String[] args) {
		//this gets executed second
		System.out.println("Subclass.STATIC_FINAL:"+Subclass.STATIC_FINAL);
		//this gets executed fourth
		System.out.println("Subclass.STATIC_FINAL2:"+Subclass.STATIC_FINAL2);
		new Subclass();
	}

}

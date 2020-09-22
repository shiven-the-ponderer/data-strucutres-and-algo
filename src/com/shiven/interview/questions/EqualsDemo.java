package com.shiven.interview.questions;

public class EqualsDemo {
	
	static String strFirst = "hello";
	static String strSecond = "hello";
	

	static String strFirstAgain = "hello";
	static String strSecondAgain = new String("hello");
	
	static String strFirstAfterAgain = new String("hello");
	static String strSecondAfterAgain = new String("hello");
	
	public static void main(String[] args) {
		System.out.println(strFirst.equals(strSecond));
		System.out.println(strFirst==strSecond);
		
		System.out.println(strFirstAgain.equals(strSecondAgain));
		//here below snippet will return false which means == operator compares object reference with exception to primitive types. But not sure about this 
		System.out.println(strFirstAgain==strSecondAgain);
		
		
		//here below equals looks for the content but == looks for the reference in the memory and String has its own equals method where
		//it compares the string object value.
		System.out.println(strFirstAfterAgain.equals(strSecondAfterAgain));
		System.out.println(strFirstAfterAgain==strSecondAfterAgain);
		
		DemoForEquals demoForEquals1 = new DemoForEquals();
		DemoForEquals demoForEquals2 = new DemoForEquals();
		
		//now object comparison
		System.out.println("object comparison"+demoForEquals1.equals(demoForEquals2));
		System.out.println(demoForEquals1==demoForEquals2);
	}

}

package com.shiven.javaeight.stream.apis;

public class DifferentKindOfStreams {
	
	public static void main(String[] args) {
//		StreamDemo streamDemo1 = new StreamDemo();
//		StreamDemo streamDemo2 = new StreamDemo();
//		StreamDemo streamDemo3 = new StreamDemo();
//		StreamDemo streamDemo4 = new StreamDemo();
//		
//		//Example 1
//		Arrays.asList(streamDemo1,streamDemo2,streamDemo3,streamDemo4)
//		.stream()
//		.findFirst()
//		.ifPresent(System.out::println);
//		
//		//No need to create collection, see below e.g.
//		Stream.of(streamDemo1,streamDemo2,streamDemo3,streamDemo4)
//		.findFirst()
//		.ifPresent(System.out::println);
		
		Thread thread = new Thread(()->System.out.println("thread started"));
		thread.start();
		
		CustomFunctionalInterface customFunctionalInterface = ()->"shiven";
		
		System.out.println(customFunctionalInterface.sayMyName());
		
		
	}
}

package com.shiven.threads.basic;

public class TestGeeksForGeeks {
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :" + t.getName());
		
		t.setName("shiven");
		
		System.out.println("after name change the name is :"+t.getName());
		
		System.out.println("Main thread priority: "+ t.getPriority());
		
		t.setPriority(10);
		
		System.out.println("Main thread new priority: "+t.getPriority());
		
		for(int i=0;i<5;i++){
			System.out.println("Main thread");
		}
		
		ChildThread childThread = new ChildThread();
		
		System.out.println("child thread priority : "+childThread.getPriority());
		
		childThread.setPriority(1);
		
		System.out.println("child thread new priority : "+childThread.getPriority());
		
		childThread.run();
	}

}

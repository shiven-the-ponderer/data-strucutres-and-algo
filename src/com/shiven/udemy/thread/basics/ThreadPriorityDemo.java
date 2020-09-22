package com.shiven.udemy.thread.basics;

public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread(new EmailCampaign());
		Thread t2 = new Thread(new DataAggregator());
		
		t1.setName("Email Campaign");
		t2.setName("Data Aggregator");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			// main thread is suspended until t2 DIES
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside main ...");
	}
}

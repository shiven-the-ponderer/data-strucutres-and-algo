package com.shiven.threads.basic;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("i am in run method");
		System.out.println(Thread.currentThread().getName());
		//Thread.yield();
		
	}
	
	public static void main(String[] args) {
		ThreadDemo threadDemo = new ThreadDemo();
		/*threadDemo.run();
		System.out.println(Thread.currentThread().getName());*/
		
		Thread thread = new Thread(threadDemo);
		thread.start();
		Thread.yield();
		System.out.println("i am in main thread");
	}
	
	

}

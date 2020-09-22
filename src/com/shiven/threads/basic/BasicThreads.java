package com.shiven.threads.basic;

public class BasicThreads {

	

	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		/*Calling a Thread object’s start( ) will perform the necessary initialization for the thread and then call that Runnable’s run( ) 
		method to start the task in the new thread. Even though start( ) appears to be making a call to a long-running method, you can see 
		from the output—the "Waiting for LiftOff’ message appears before the countdown has completed—that start( ) quickly returns. In effect,
				you have made a method call to LiftOff.run( ), and that method has not yet finished, 
		but becauseLiftOff.run( ) is being executed by a different thread, you can still perform other operations in the main( ) thread.*/
		thread.start();
		System.out.println("waiting for liftoff");
	}
}

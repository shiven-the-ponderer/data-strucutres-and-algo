package com.shiven.threads.basic;

public class MoreBasicThreads {
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			/*Calling a Thread object’s start( ) will perform the necessary initialization for the thread and then call that Runnable’s run( ) 
			method to start the task in the new thread. Even though start( ) appears to be making a call to a long-running method, you can see 
			from the output—the "Waiting for LiftOff’ message appears before the countdown has completed—that start( ) quickly returns. In effect,
					you have made a method call to LiftOff.run( ), and that method has not yet finished, 
			but becauseLiftOff.run( ) is being executed by a different thread, you can still perform other operations in the main( ) */
			
			//In the liftoff class if we remove thread.yield() the order of o/p becomes sequential which implies that thread.yield will allow scheduler 
			//to assign processor to other threads and o/p will be in random order, do try commenting thread.yield in liftoff.... 
			new Thread(new LiftOff()).start();
			System.out.println("waiting for liftoff");
		}
	}

}

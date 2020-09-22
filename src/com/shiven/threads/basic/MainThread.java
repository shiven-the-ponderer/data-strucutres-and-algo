package com.shiven.threads.basic;

public class MainThread {
	
	
	public static void main(String[] args) {
		LiftOff liftOff = new LiftOff();
		//here run is directly called from main thread so there is no need of thread intialization , so first run is called then other syso statement.
		for(int i=0;i<5;i++) {
			new LiftOff().run();
			System.out.println("Waiting for LiftOff");
		}	
	}	
}

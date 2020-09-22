package com.shiven.threads.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i =0;i<5;i++) {
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
		
		//below line will throw exception beacuse now no new tasks can be submitted to executor service.
		//executorService.execute(new LiftOff());
	}

}

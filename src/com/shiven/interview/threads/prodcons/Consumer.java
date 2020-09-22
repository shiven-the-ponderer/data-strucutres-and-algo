package com.shiven.interview.threads.prodcons;

public class Consumer implements Runnable{
	
	NumberGenerator numberGenerator;
	
	public Consumer(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
		Thread thread = new Thread(this,"consumer");
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			numberGenerator.getId();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

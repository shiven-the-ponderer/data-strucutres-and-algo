package com.shiven.interview.threads.prodcons;

public class Producer implements Runnable{
	
	NumberGenerator numberGenerator;
	
	public Producer(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
		Thread thread = new Thread(this,"producer");
		thread.start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			numberGenerator.setId(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.shiven.interview.threads.prodcons;

public class NumberFactory {
	
	int num;
	
	public void setNum(int num) {
		this.num = num;
		System.out.println("num"+num);
	}

}

class OddFactory implements Runnable{
	
	NumberFactory factory;
	
	public OddFactory(NumberFactory factory) {
		this.factory = factory;
		Thread thread = new Thread(this,"OddFactory");
		thread.start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			factory.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class EvenFactory implements Runnable{

	NumberFactory factory;
	
	public EvenFactory(NumberFactory factory) {
		this.factory = factory;
		Thread thread = new Thread(this,"OddFactory");
		thread.start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			factory.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
}





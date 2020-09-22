package com.shiven.interview.threads.prodcons;

public class InterThread {
	
	public static void main(String[] args) {
		NumberGenerator generator = new NumberGenerator();
		new Producer(generator);
		new Consumer(generator);
	}

}

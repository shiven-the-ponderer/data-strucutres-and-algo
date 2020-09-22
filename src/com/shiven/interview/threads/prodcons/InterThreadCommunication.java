package com.shiven.interview.threads.prodcons;

public class InterThreadCommunication {
	
	public static void main(String[] args) {
		NumberFactory factory = new NumberFactory();
		new OddFactory(factory);
		new EvenFactory(factory);
	
}

}

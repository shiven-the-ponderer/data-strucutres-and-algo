package com.shiven.udemy.thread.race;

public class RaceConditionDemo {
	
	public static void main(String[] args) {
		
		BankAccount task = new BankAccount();
		task.setBalance(100);
		
		Thread john = new Thread(task);
		Thread anita = new Thread(task);
		
		john.setName("john");
		anita.setName("anita");
		
		john.start();
		anita.start();
	}

}

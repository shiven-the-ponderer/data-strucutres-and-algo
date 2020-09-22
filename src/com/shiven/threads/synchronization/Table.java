package com.shiven.threads.synchronization;

public class Table {
	
	 synchronized void printTable(int n) {
		for(int i=0;i<=5;i++) {
			System.out.println(i*n);
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

package com.shiven.threads.synchronization;

public class MyThread1 extends Thread{
	
	Table t;
	public MyThread1(Table table) {
		t = table;
	}
	
	public void run() {
		t.printTable(5);
	}
}

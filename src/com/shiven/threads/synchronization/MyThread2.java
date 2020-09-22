package com.shiven.threads.synchronization;

public class MyThread2 extends Thread{
	
	Table t;
	public MyThread2(Table table) {
		t = table;
	}
	
	public void run() {
		t.printTable(100);
	}

}

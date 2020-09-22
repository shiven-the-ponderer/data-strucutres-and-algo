package com.shiven.interview.threads.prodcons;

public class NumberGenerator {
	
	int id;
	boolean valueSet = false;
	
	public synchronized void setId(int id) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Set :"+id);
		this.id = id;
		valueSet = true;
		notify();
	}
	
	public synchronized void getId() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get :"+id);
		valueSet=false;
		notify();
	}

}

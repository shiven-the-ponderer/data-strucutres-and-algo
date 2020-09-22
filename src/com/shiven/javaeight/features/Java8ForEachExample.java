package com.shiven.javaeight.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Java8ForEachExample {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		for(int i=0; i<10; i++) myList.add("shiven");
		
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		/*myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
		});*/
		
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}
			
}

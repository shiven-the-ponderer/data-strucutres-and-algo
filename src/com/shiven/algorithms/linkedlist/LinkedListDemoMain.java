package com.shiven.algorithms.linkedlist;

public class LinkedListDemoMain {
	
	
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.add("5");
		linkedListDemo.add("15");
		linkedListDemo.add("25");
		linkedListDemo.add("35");
		linkedListDemo.add("45");
		linkedListDemo.printList(linkedListDemo.getHead());
		Node node = linkedListDemo.reverse();
		linkedListDemo.printList(node);
		
		
	}
}

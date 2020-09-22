package com.shiven.algorithms.linkedlist;

public class NewLinkedListMain {
	
	
		 public static void main(String[] args) {
			LinkedListGeeks geeks = new LinkedListGeeks();
			geeks.push(5);
			geeks.push(6);
			geeks.push(7);
			geeks.push(8);
			geeks.printLinkedList(geeks.head);
			geeks.reverse();
			geeks.printLinkedList(geeks.head);
		}
	
}

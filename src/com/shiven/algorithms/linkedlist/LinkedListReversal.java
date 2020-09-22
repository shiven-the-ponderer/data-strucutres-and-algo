package com.shiven.algorithms.linkedlist;

public class LinkedListReversal {
	
	Node head;
	
	private class Node{
		
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
	
	public void push(int data) {
		Node currentNode = head;
		if(currentNode==null) {
			currentNode = new Node(data);
			head = currentNode;
			return;
		}
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(data);
		//head = currentNode;
	}
	
	public void printLinkedList() {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListReversal linkedListReversal = new LinkedListReversal();
		linkedListReversal.push(3);
		linkedListReversal.push(4);
		linkedListReversal.push(5);
		linkedListReversal.printLinkedList();
		
	}
	
	

}

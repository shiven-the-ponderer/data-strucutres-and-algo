package com.shiven.algorithms.linkedlist;

public class CircularLinkedList {
	
	public Node head = null;
	public Node tail = null;
	public int size = 0;
	
	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			//next = null;
		}
	}
	
	public void addNodeAtStart(int data){
		System.out.println("Adding node"+ data + "at start");
		Node node = new Node(data);
		
		
	}
	
	

}

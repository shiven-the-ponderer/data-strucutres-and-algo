package com.shiven.algorithms.linkedlist;

public class Node {
	
	Node next;
	Object data;
	
	public Node(Object dataValue){
		next = null;
		data = dataValue;
	}
	
	public Node(Object dataValue,Node nextValue){
		next = nextValue;
		data = dataValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}

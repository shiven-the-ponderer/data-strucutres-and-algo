package com.shiven.algorithms.linkedlist;

public class LinkedListDemo {
	private Node head;
	private Node currentNode;
	private Node nextNode;
	private Node tempNode;
	private Node prev;

	public Node getHead() {
		return head;
	}

	public void add(Object data){
		if(head == null){
			head = new Node(data);
			return;
		}
		
		currentNode = head;
		tempNode = new Node(data);
		
		if(currentNode != null){
			while(currentNode.getNext()!=null){
				currentNode = currentNode.getNext();
			}
			
			currentNode.setNext(tempNode);
		}
	}

	public Node reverse() {
		currentNode = head;
		prev = null;
		while(currentNode!=null) {
			nextNode = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = nextNode;
		}
		return prev;
	}

	public Node delete(Object data) {
		Node tempNode = new Node(data);
		if(tempNode.data==head.data) {
			head = null;
			return head;
		}
		currentNode = head;
		while (currentNode.next!=null) {
			if(currentNode.data==tempNode.data) {
				prev.next = currentNode.next;
				return head;
			}
			prev = currentNode;
			currentNode = currentNode.next;
		}
		return head;
	}
	
	
	public void printList(Node node)
	{
		while(node!=null) {
			System.out.println(node.data+ ", ");
			node = node.next;
		}
		System.out.println(node);
	}
}

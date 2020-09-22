package com.shiven.algorithms.linkedlist;

public class LinkedListGeeks {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	public Node reverse() {
	    Node current = head;
	    Node prev = null;
	    Node next = null;
	    while(current!=null) {
	       next = current.next;
	       current.next = prev;
	       prev = current;
	       current = next;
	    }
	    head = prev;
        return head;
	    
	}
	
	public Node insertAtBeginning(Node newNode){
		if(head!=null){
			newNode.next = head;
		}
		head = newNode;
		return head;
	}
	
	public Node insertAtEnd(Node endNode){
		Node nextNode = head;
		while(nextNode.next!=null){
			nextNode = nextNode.next;
		}
		nextNode.next = endNode;
		return head;
	}
	
	public Node insert(Node prevNode, int data){
		
		if(prevNode==null){
			System.out.println("prev node can not be null");
		}
		
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		return head;
	}
	
	public void deleteNode(int key){
		
		Node temp = head;
		Node prev = null;
		
		if(temp!=null && temp.data==key){
			head = temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp==null){
			System.out.println("Key is not present in the linked list");
			return;
		}else{
			prev.next = temp.next;
		}
		
	}
	
	public void deleteAtPosition(int position){
		if(length(head)<position){
			System.out.println("Linked list out of bound");
			return;
		}
		Node temp = head;
		Node prev = null;
		for(int i=0;i<position;i++){
			prev = temp;
			temp = temp.next;
			if(i==position){
				prev.next = temp.next;
			}
		break;	
		}
		
	}
	
	public void push(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public void pushNull(){
		head = null;
	}
	
	public int length(Node head){
		int i = 0;
		
			while(head!=null){
				head = head.next;
				i++;
			}
			return i;
	}
	
	public void printLinkedList(Node head){
		while(head!=null){
			System.out.println(head.data+"\t");
			head = head.next;
		}
		System.out.println(head);
	}
}




 
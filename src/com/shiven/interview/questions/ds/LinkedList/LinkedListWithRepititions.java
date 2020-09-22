package com.shiven.interview.questions.ds.LinkedList;

public class LinkedListWithRepititions {

    Node head;

    public Node getHead() {
        return head;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        if(head==null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next!=null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void printList(Node head) {
        while(head!=null) {
            System.out.println(head.data+"\t");
            head=head.next;
        }
    }

    public Node removeDuplicates(Node head) {
        Node current = head;
        while(current!=null && current.next!=null) {//checking if data matches with next then remove next node .
            while(current!=null && current.next!=null && current.data==current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }

    public int getLength(Node head) {
        Node current = head;
        int length = 0;
        while(current!=null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        LinkedListWithRepititions linkedListWithRepititions = new LinkedListWithRepititions();
        linkedListWithRepititions.push(1);
        linkedListWithRepititions.push(2);
        linkedListWithRepititions.push(2);
        linkedListWithRepititions.push(2);
        linkedListWithRepititions.push(3);
        linkedListWithRepititions.push(3);
        linkedListWithRepititions.push(4);
        linkedListWithRepititions.push(5);
        linkedListWithRepititions.push(5);
        Node head = linkedListWithRepititions.removeDuplicates(linkedListWithRepititions.getHead());
        linkedListWithRepititions.printList(head);
        System.out.println(linkedListWithRepititions.getLength(head));


    }
}

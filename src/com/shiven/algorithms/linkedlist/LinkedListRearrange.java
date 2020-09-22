package com.shiven.algorithms.linkedlist;

public class LinkedListRearrange {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node rearrangeList() {
        System.out.println(head);
        Node singleJump = head;
        Node doubleJump = singleJump.next;
        while(doubleJump!=null && doubleJump.next!=null) {
            singleJump = singleJump.next;
            doubleJump = doubleJump.next.next;
        }
        return head;
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

    public void printList() {
        while(head!=null) {
            System.out.println(head.data+"\t");
            head=head.next;
        }
    }

    public void checkObject() {
        Node node = new Node(3);
        node.next=new Node(5);
        Node temp = node;
        Node current = temp.next;
        System.out.println(node.next.data);
        Node node1 = new Node(100);
        current.next=node1;
        System.out.println(node.next.next.data);

        System.out.println(temp.next.data);


    }

    public static void main(String[] args) {
        LinkedListRearrange rearrange = new LinkedListRearrange();
        rearrange.push(1);
        rearrange.push(2);
        rearrange.push(7);
        rearrange.push(5);
        rearrange.push(9);
        rearrange.checkObject();
        //rearrange.printList();
//        rearrange.rearrangeList();
//        rearrange.printList();
    }


}

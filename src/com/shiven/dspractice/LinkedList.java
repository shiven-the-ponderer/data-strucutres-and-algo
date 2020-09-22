package com.shiven.dspractice;

public class LinkedList {

    Node head;
    static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        if(head==null){
            head = new Node(data);
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public void insertAtPosition(int pos, Node node) {
        Node temp = head;
        int count = 1;
        while (count<pos && temp!=null){
            temp = temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next = node;
        print();
    }

    public void print() {
        if(head==null){
            System.out.println("null");
        } else {
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insertAtPosition(2,new LinkedList.Node(6));
        //linkedList.print();
    }


}

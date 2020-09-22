package com.shiven.interview.questions.ds.LinkedList;


//Given the head node of a singly LinkedList, write a program to print the values as follows –
//        Print 1st element, then print last element, Print 2nd element, then print 2nd last element, print 3rd element, then print 3rdlast element and so on. E.g. if the singly linked list has the data as : 1, 3, 5, 7, 9, 10, 12, 15 the output should be – 1, 15, 3, 12, 5, 10, 7, 9
//
//        Write all supporting classes and methods to create a LinkedList and insert elements into the list.
//
//        Constraints –
//
//        ·       The solution should have time complexity better than O(n^2)
//
//        ·       The solution should have space complexity better than O(n)

public class PrintToAndFro {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //method to reverse a linked list
    Node reverselist(Node node)
    {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void rearrange()
    {
        Node node = head;
        Node singleJump = node, doubleJump = singleJump.next;
        while (doubleJump != null && doubleJump.next != null) {//finding middle of linked list
            singleJump = singleJump.next;
            doubleJump = doubleJump.next.next;
        }

        Node node1 = node;
        Node node2 = singleJump.next;
        singleJump.next = null;

        node2 = reverselist(node2);

        node = new Node(0);

        Node curr = node;
        while (node1 != null || node2 != null) {

            // Add element from start
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            // Then add the element from next to mid
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }

        head = node.next;

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


    public static void main(String[] args) {
        PrintToAndFro printToAndFro = new PrintToAndFro();
        printToAndFro.push(1);
        printToAndFro.push(2);
        printToAndFro.push(7);
        printToAndFro.push(5);
        printToAndFro.push(9);
        printToAndFro.push(10);
        printToAndFro.rearrange();
        printToAndFro.printList();
    }


}


package com.shiven.algorithms.tree;

public class TreeMain {
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(8); 
        tree.root.left = new Node(3); 
        tree.root.right = new Node(10); 
      //  tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
//        
//        tree.root = new Node(1); 
//        tree.root.left = new Node(2); 
//        tree.root.right = new Node(3); 
//        tree.root.left.left = new Node(4); 
//        tree.root.left.right = new Node(5); 
//        System.out.println("\ninorder traversal of binary tree is "); 
//        tree.inorder();
        
        Node node = tree.binarySearch(6);
        System.out.println(node.right.key);
       
    }
    
}

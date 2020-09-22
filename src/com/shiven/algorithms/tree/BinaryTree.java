package com.shiven.algorithms.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
    
    Node root;
    
    public BinaryTree() {
        root = null;
    }
    
    void printPostOrder(Node node) {
        if(node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        
        System.out.println(node.key);
    }
    
    void printPostOrder() {
        printPostOrder(root);
    }
    
    void iterationPostOrder(Node root) {
        if(root == null) {
            return;
        }
        
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(current!=null || !stack.isEmpty()) {
           while(current!=null) {
               stack.push(current);
               current = current.left;
           }
           current = stack.pop(); 
           System.out.println(current.key);
           if(current.right!=null) {
               stack.push(current.right);
               current = current.right;
           } else {
               System.out.println(stack.pop().key);
               current = stack.pop();
           }
       }
        
        
    }
    
    void inorder() {
        if(root == null) {
            return; 
        }
        
        Stack<Node> stack = new Stack<>();
        
        Node current = root;
        while(current!=null || stack.size()>0) {
            
            while(current!=null) {
                stack.push(current);
                current = current.left;
            }
            
           current = stack.pop();
           System.out.println(current.key);
           current = current.right;
        }
        
    }
    
    void zigzagTraversal() {
        if(root==null) {
            return;
        }
        int counter = 0;
        Stack<Node> stack = new Stack<>();
        Queue<Node> q = new ArrayDeque<>();
        Node current = root;
        System.out.println("\t"+root.key);
        q.add(current);
        while(!q.isEmpty()) {
            counter++;
            while(!q.isEmpty()) {
                stack.push(q.remove());
            }
            
            while(!stack.isEmpty()) {
                current = stack.pop();  
               if(counter%2!=0) {
                  if(current.right!=null) {
                      System.out.println("\t"+current.right.key);
                      q.add(current.right);
                  }
                  if(current.left!=null) {
                      System.out.println("\t"+current.left.key);
                      q.add(current.left);
                  }
               }else {
                  if(current.left!=null) {
                      System.out.println("\t"+current.left.key);
                      q.add(current.left);
                  }
                  if(current.right!=null) {
                      System.out.println("\t"+current.right.key);
                      q.add(current.right);
                  }
               }
            }     
        }
    }
    
    Node binarySearch(int key) {
        Node current = root;
        while(current!=null) {
            if(key==current.key) {
                return current;
            }
            else {
                if(key>current.key) {
                    if(current.right!=null && current.right.key==key) {
                        return current.right;
                    } else {
                        current = current.right;
                    }
                } else {
                    if(current.left!=null && current.left.key==key) {
                        return current.left;
                    } else {
                        current = current.left;
                    }
                }
            } 
        }
        return null;
    }
}

class Node{
    int key;
    Node right, left;
    
    public Node(int item) {
        this.key = item;
        left = right = null;
    }
    
}


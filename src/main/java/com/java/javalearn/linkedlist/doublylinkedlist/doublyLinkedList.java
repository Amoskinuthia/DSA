package com.java.javalearn.linkedlist.doublylinkedlist;

public class doublyLinkedList {
    private Node head = null;
    private int size = 0;

    public doublyLinkedList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null){
            head.previous = node;
        }
        head = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private static class Node{
     private final int value;
     private Node next;
     private Node previous;
     public Node(int value){
         this.value = value;
     }
     public Node(int value,Node next,Node previous){
         this.value = value;
         this.next = next;
         this.previous = previous;
     }
 }
}

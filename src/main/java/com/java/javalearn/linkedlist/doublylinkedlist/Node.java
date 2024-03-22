package com.java.javalearn.linkedlist.doublylinkedlist;

public class Node {

    public static void main(String[] args){
        doublyLinkedList list = new doublyLinkedList();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insert(6,3);
        list.insertLast(99);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
        list.display();

    }
}

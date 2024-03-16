package com.java.javalearn.linkedlist.singlylinked;

public class Node {

    public static void main(String[] args){
        singlyLinkedList list = new singlyLinkedList();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insert(50,3);
        list.insertLast(99);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();

    }
}

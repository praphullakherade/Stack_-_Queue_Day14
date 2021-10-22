package com.stackqueue;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("Inserting element into queue ::");
        Stack stack = new Stack();
        stack.addNode(56);
        stack.addNode(30);
        stack.addNode(70);
        stack.printList();
    }
}

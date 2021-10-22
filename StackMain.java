package com.stackqueue;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("deleting element ::");
        Stack stack = new Stack();
        stack.addNode(70);
        stack.addNode(30);
        stack.addNode(56);
        stack.printList();
        stack.peek();
        stack.deleteHead();
        stack.printList();
        stack.peek();
        stack.deleteHead();
        stack.printList();
        stack.peek();
        stack.deleteHead();
    }
}

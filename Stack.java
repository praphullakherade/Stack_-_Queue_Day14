package com.stackqueue;

public class Stack {
    Node head;

    //add element
    public void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        printList();
    }

    //print stack
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void peek(){
        Node peekValue = head;
        System.out.println("Top element is :");
        System.out.println(head.data);
    }

    //deleting element
    public void deleteHead() {
        System.out.println("deleting top node");
        Node temp=head;
        if(temp!=null) {
            head=temp.next;
        }
    }
}

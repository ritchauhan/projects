package com.dev.java.dataStructure.queue;

public class BasicQueueImplementation {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from head
    private Node tail; // add to tail

    // isEmpty
    boolean isEmpty() {
        return (head == null);
    }

    // peek
    int peek() {
        return head.data;
    }

    // add
    void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
    }

    // remove
    int remove() {
        if (head == null) {
            tail = null;
            return -1;
        }
        int result = head.data;
        head = head.next;
        return result;
    }

    // print queue
    void print() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // test method
    public static void main(String[] args) {
        BasicQueueImplementation basicQueueImplementation = new BasicQueueImplementation();
//        basicQueueImplementation.add(10);
//        basicQueueImplementation.add(20);
//        basicQueueImplementation.add(30);
//        basicQueueImplementation.add(40);
        basicQueueImplementation.remove();
//        System.out.println(basicQueueImplementation.isEmpty());
//        System.out.println(basicQueueImplementation.peek());
//        basicQueueImplementation.print();
    }


}

package com.dev.java.dataStructure.stack;

public class BasicStack {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
           this.data = data;
        }
    }

    private Node top;

    // isEmpty
    boolean isEmpty() {
        return top == null;
    }

    // top
    int peek () {
        return top.data;
    }

    // add
    void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
            return;
        }
        node.next = top;
        top = node;
    }

    // remove
    int pop() {
        if(top == null) {
            top = null;
            return -1;
        }
        int topData = top.data;
        top = top.next;
         return topData;
    }

    // print
    void print() {
        while (top != null) {
            System.out.println(top.data);
            top = top.next;
        }
    }

    // test
    public static void main(String[] args) {
        BasicStack basicStack = new BasicStack();
        basicStack.push(10);
        basicStack.push(20);
        basicStack.push(30);
        System.out.println(basicStack.pop());
        System.out.println(basicStack.peek());
        basicStack.print();
    }

}

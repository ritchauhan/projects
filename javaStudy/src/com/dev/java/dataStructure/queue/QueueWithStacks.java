package com.dev.java.dataStructure.queue;

import java.util.Stack;

public class QueueWithStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int peek() {
        return stack1.peek();
    }

    public int deque() {
       return stack1.pop();
    }

    public static void main(String[] args) {
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(10);
        queueWithStacks.enqueue(20);
        queueWithStacks.enqueue(30);
        queueWithStacks.enqueue(40);
        System.out.println(queueWithStacks.peek());
        queueWithStacks.deque();
        System.out.println(queueWithStacks.peek());
    }
}

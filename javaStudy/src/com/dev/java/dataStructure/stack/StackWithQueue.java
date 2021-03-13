package com.dev.java.dataStructure.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class StackWithQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    public void push(Integer data) {
        q2.add(data);
        for (int i=0; i<q1.size()-1; i++) {
            int a = q1.poll();
            q2.add(a);
        }
        q1 = q2;

    }

    public Integer top() {
        return q1.peek();
    }

    public int pop() {
        return q1.poll();
    }

    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());

    }

}

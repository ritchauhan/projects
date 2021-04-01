package com.dev.java.dataStructure.tree;

import java.util.Stack;

/**
 * print the tree in spiral order
 */
public class SpiralOrderTree {

    public static void printTree(Node tree) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.add(tree);
        while (!(stack1.empty() && stack2.empty())) {
            while (!stack1.empty()) {
               Node currentNode = stack1.pop();
               if (currentNode.left != null) {
                   stack2.push(currentNode.left);
               }
               if (currentNode.right != null) {
                   stack2.push(currentNode.right);
               }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
            while (!stack2.isEmpty()) {
                Node currentNode = stack2.pop();
                if (currentNode.right != null) {
                    stack1.push(currentNode.right);
                }
                if (currentNode.left != null) {
                    stack1.push(currentNode.left);
                }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTree(TreeImplementation.getTree());
    }
}

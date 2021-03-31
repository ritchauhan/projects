package com.dev.java.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * print the tree in reverse order
 */
public class ReversalOrderTreePrint {
    public static void printTree(Node tree) {
        if (tree == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            stack.add(currentNode);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        printTree(TreeImplementation.getTree());
    }
}

package com.dev.java.dataStructure.tree;

import java.util.Stack;

public class PreOrderIterative {

    public static void preOrderTreeIterations(Node root) {
        Stack<Node> treeStack = new Stack<>();
        treeStack.add(root);
        while (!treeStack.isEmpty()) {
            Node node = treeStack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                treeStack.push(node.right);
            }
            if (node.left != null) {
                treeStack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        preOrderTreeIterations(TreeImplementation.getTree());
    }
}

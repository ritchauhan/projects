package com.dev.java.dataStructure.tree;

import java.util.Stack;

public class InOrderIterative {

    public static void inOrderTreeTraversal(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> treeStack = new Stack<>();
        while (true) {
            if (root != null) {
                treeStack.add(root);
                root = root.left;
            } else {
                if (treeStack.isEmpty()) break;
                root = treeStack.pop();
                System.out.print(root.data + " ");
                root = root.right;
            }
        }
    }
    public static void main(String[] args) {
        inOrderTreeTraversal(TreeImplementation.getTree());
    }
}

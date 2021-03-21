package com.dev.java.dataStructure.tree;

import java.util.Stack;

/**
 * PostOrderIterative demo
 */
public class PostOrderIterative {

    public static void postOrderTreeTraversalIterative(Node root) {
        Stack<Node> treeStack = new Stack<>();
        Stack<Node> treeStack2 = new Stack<>();
        if (root == null) {
            return;
        }
        treeStack.push(root);
        while (!treeStack.isEmpty()) {
            Node rootNode = treeStack.pop();
            treeStack2.push(rootNode);
            if (rootNode.left != null) {
                treeStack.push(rootNode.left);
            }
            if (rootNode.right != null) {
                treeStack.push(rootNode.right);
            }
        }

        while (!treeStack2.isEmpty()) {
            Node tree = treeStack2.pop();
            System.out.print(tree.data + " ");
        }
    }

    public static void main(String[] args) {
        postOrderTreeTraversalIterative(TreeImplementation.getTree());
    }
}

package com.dev.java.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * post order tree traversal with stack
 * need to understand
 */
public class PostOrderTreeTraversalWithStack {

    public static void postOrderTreeTraversal(Node tree) {
//        if (tree == null) {
//            return;
//        }
//        Stack<Node> stack = new Stack<>();
//        Node current = tree;
//
//        while (!stack.isEmpty() || (current != null)) {
//            if (current.left != null) {
//                stack.push(current.left);
//            } else {
//                Node temp = stack.peek().right;
//                if (temp == null) {
//                    temp = stack.pop();
//                    System.out.print(temp.data + " ");
//                    while (!stack.isEmpty() || (temp == stack.peek().right) ) {
//                        temp = stack.pop();
//                        System.out.print(temp.data + " ");
//                    }
//                } else {
//                    current = temp;
//                }
//            }
//        }

        System.out.println(tree);

    }

    public static void main(String[] args) {
        postOrderTreeTraversal(TreeImplementation.getTree());
    }
}

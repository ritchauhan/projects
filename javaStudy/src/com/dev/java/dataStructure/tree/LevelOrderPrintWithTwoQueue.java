package com.dev.java.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level order print by two queue
 */
public class LevelOrderPrintWithTwoQueue {

    public static void printLevelOrderWithTwoQueue(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        queue1.add(root);
        while (!(queue1.isEmpty() && queue2.isEmpty())) {
            while (!queue1.isEmpty()) {
                Node currentNode = queue1.poll();
                if (currentNode.left != null) {
                    queue2.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue2.add(currentNode.right);
                }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
            while (!queue2.isEmpty()) {
                Node currentNode = queue2.poll();
                if (currentNode.left != null) {
                    queue1.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue1.add(currentNode.right);
                }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printLevelOrderWithTwoQueue(TreeImplementation.getTree());
    }
}

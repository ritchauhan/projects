package com.dev.java.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * level order print with new line
 */
public class LevelOrderPrintWithQueue {
    /**
     * Level by level tree traversal
     */
    public static void printTreeByLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        treeQueue.add(null);
        while (!treeQueue.isEmpty()) {
            Node currentNode = treeQueue.poll();
            try {
                if (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        treeQueue.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        treeQueue.add(currentNode.right);
                    }
                } else {
                    System.out.println();
                    if (!treeQueue.isEmpty()) {
                        treeQueue.add(null);
                    }
                }
            } catch (Exception e) {
                System.out.println();
                treeQueue.add(null);
            }
        }
    }

    public static void main(String[] args) {
        printTreeByLevel(TreeImplementation.getTree());
    }
}

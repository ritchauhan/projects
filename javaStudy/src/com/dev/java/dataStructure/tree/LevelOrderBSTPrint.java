package com.dev.java.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * print level order binary tree
 */
public class LevelOrderBSTPrint {

    private static void printLevelOrder(Node root){
        if (root == null) {
            System.out.println("tree is empty");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            System.out.println(root.data);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }

    public static void main(String[] args) {
        printLevelOrder(TreeImplementation.getTree());
    }
}

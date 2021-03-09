package com.dev.java.interview.tree;

import com.dev.java.dataStructure.tree.Node;
import com.dev.java.dataStructure.tree.TreeImplementation;

public class BinarySearchTree {

    public static boolean validateBST(Node tree, int min, int max) {
        if (tree == null) {
            return true;
        }
        if (tree.getData() < min || tree.getData() > max) {
            return false;
        }
        return validateBST(tree.getLeft(), min, tree.getData()-1)
                && validateBST(tree.getRight(), tree.getData() + 1, max);
    }

    public static boolean checkBST(Node tree) {
        return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Node treeNode = TreeImplementation.getTree();
        System.out.println(checkBST(treeNode));
    }
}

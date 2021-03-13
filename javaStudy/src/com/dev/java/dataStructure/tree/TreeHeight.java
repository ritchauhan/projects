package com.dev.java.dataStructure.tree;

/**
 * class to calculate height of the tree
 */
public class TreeHeight {
    // Height of the tree
    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        Node node = TreeImplementation.getTree();
        System.out.println(getHeight(node));
    }
}

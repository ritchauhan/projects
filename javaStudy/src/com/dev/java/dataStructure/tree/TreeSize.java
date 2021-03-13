package com.dev.java.dataStructure.tree;

/**
 * class to find size of the tree
 */
public class TreeSize {

    private static int getTreeSize(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = getTreeSize(root.left);
        int rightNode = getTreeSize(root.right);
        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        Node node = TreeImplementation.getTree();
        System.out.println(getTreeSize(node));
    }
}

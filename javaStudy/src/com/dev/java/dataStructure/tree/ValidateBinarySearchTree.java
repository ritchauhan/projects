package com.dev.java.dataStructure.tree;

/**
 * validate binary search tree.
 * Need to check if given tree is binary search tree.
 */
public class ValidateBinarySearchTree {

    private static boolean validateBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data > max) {
            System.out.println(root.data);
            return false;
        }
        return validateBST(root.left, min, root.data)
                && validateBST(root.right, root.data, max);
    }

    private static boolean validateBinarySearchTree(Node root) {
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        boolean result = validateBinarySearchTree(TreeImplementation.getTree());
        boolean result1 = validateBinarySearchTree(TreeImplementation.sampleTree());
        System.out.println(result);
        System.out.println(result1);

    }
}

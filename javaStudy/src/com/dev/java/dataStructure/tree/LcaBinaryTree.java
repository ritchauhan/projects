package com.dev.java.dataStructure.tree;

/**
 * lowest common ancestor with binary tree
 */
public class LcaBinaryTree {
    public static Node lca (Node tree, int n1, int n2) {
        if (tree == null) {
            return tree;
        }

        if (tree.data == n1 || tree.data == n2 ) {
            return tree;
        }
        Node left = lca(tree.left, n1, n2);
        Node right = lca(tree.right, n1, n2);
        if (left != null && right != null) return tree;
        if (left == null && right == null) return null;

        return left != null ? left : right;
    }
    public static void main(String[] args) {
        Node resultNode = lca(TreeImplementation.getTree(), 4, 6);
        System.out.println(resultNode.data);
    }
}

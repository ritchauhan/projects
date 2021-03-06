package com.dev.java.dataStructure.tree;

/**
 * Find out if two tree are same
 */
public class SameTree {
    public static void main(String[] args) {
        boolean result = sameTreeCheckIterative(TreeImplementation.getTree(),
                TreeImplementation.getTree());
        TreeImplementation treeImplementation = new TreeImplementation();
        treeImplementation.add(9);
        treeImplementation.add(4);
        treeImplementation.add(6);
        treeImplementation.add(20);
        treeImplementation.add(170);
        System.out.println(result);
        boolean result1 = sameTreeCheckIterative(TreeImplementation.getTree()
                , treeImplementation.root);
        System.out.println(result1);
    }

    /**
     * This breaks for
     * [1, 2]
     * [1, null, 2]
     * @param tree1
     * @param tree2
     * @return
     */
    static boolean sameTreeCheckIterative(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        Node leftTree1 = tree1.left;
        Node leftTree2 = tree2.left;
        Node rightTree1 = tree1.right;
        Node rightTree2 = tree2.right;
        while (leftTree1 != null && leftTree2 != null) {
            if (leftTree1.data != leftTree2.data) {
                return false;
            }
            if ((leftTree1.left == null && leftTree2.left != null)
            || (leftTree1.left != null && leftTree2.left == null)) {
                return false;
            }
            leftTree1 = leftTree1.left;
            leftTree2 = leftTree2.left;

        }
        while (rightTree1 != null && rightTree2 != null) {

            if (rightTree1.data != rightTree2.data) {
                return false;
            }
            if ((rightTree1.left == null && rightTree2.left != null)
                    || (rightTree1.left != null && rightTree2.left == null)) {
                return false;
            }
            rightTree1 = rightTree1.left;
            rightTree2 = rightTree2.left;

        }
        return true;
    }

    /**
     * 
     * @param tree1
     * @param tree2
     * @return
     */
    static boolean sameTreeRecursive(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return tree1.data == tree2.data &&
        sameTreeRecursive(tree1.left, tree2.left) &&
        sameTreeRecursive(tree1.right, tree2.right);
    }
}

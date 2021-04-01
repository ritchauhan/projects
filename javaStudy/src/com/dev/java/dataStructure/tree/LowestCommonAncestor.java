package com.dev.java.dataStructure.tree;

public class LowestCommonAncestor {
    public static int lca(Node root, int data1, int data2) {
//        System.out.println(root.data);
//        System.out.println(Math.max(data1, data2));
        if (root.data > Math.max(data1, data2)) {
            return lca(root.left, data1, data2);
        } else if (root.data < Math.min(data1, data2)) {
            return lca(root.right, data1, data2);
        } else {
            System.out.println("result" + root.data);
            return root.data;
        }
    }
    public static void main(String[] args) {
        int resultNode = lca(TreeImplementation.getTree(), 1, 6);
        System.out.println(resultNode);
    }
}

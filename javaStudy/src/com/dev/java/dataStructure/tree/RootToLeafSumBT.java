package com.dev.java.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * class to find root to leaf sum from binary tree
 */
public class RootToLeafSumBT {

    private static boolean rootToLeafSum(Node root, int sum, List<Integer> list) {
        if (root == null) {
            return false;
        }
        if (root.left ==null && root.right == null) { // leaf node
            if (root.data == sum) {
                list.add(root.data);
                System.out.println(list);
                return true;
            } else {
                return false;
            }
        }
        if (rootToLeafSum(root.left, sum - root.data, list)) {
            list.add(root.data);
            return true;
        }
        if (rootToLeafSum(root.right, sum - root.data, list)) {
            list.add(root.data);
            return true;
        }
        System.out.println(list);
        return false;
    }

    public static void main(String[] args) {
        Node node = TreeImplementation.getTree();
        System.out.println(rootToLeafSum(node, 14, new ArrayList<Integer>()));
    }
}

package com.dev.java.dataStructure.tree;

class Node {
    int data;
    Node left;
    Node right;
    public Node() {}
    public Node(int data) {
        this.data = data;
    }
}

/**
 * Binary search tree implementation with insert
 */
public class TreeImplementation {
    Node root;

    // add node in tree
    void add (int data) {
        Node newNode = new Node(data);
        Node currentNode = root;
        if (root == null) {
            root = newNode;
            return;
        }
        while (currentNode != null) {
            if (currentNode.data > newNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
        root = currentNode;
    }

    // preorder bst (value left right)
    void preOrderTree() {
        preorder(root);
    }

    // inorder bst (left value right )
    void inOrderTree() {
        inOrder(root);
    }

    // postOrder bst (left right value)
    void postOrderTree() {
        postOrder(root);
    }

    // preorder traversal
    void preorder(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.data + " ");
            preorder(currentNode.left);
            preorder(currentNode.right);
        }
    }

    // inOrder traversal
    void inOrder(Node treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.left);
            System.out.print(treeNode.data + " ");
            inOrder(treeNode.right);
        }
    }

    // postOrder traversal
    void postOrder(Node treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.print(treeNode.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeImplementation treeImplementation = new TreeImplementation();
        treeImplementation.add(9);
        treeImplementation.add(4);
        treeImplementation.add(6);
        treeImplementation.add(20);
        treeImplementation.add(170);
        treeImplementation.add(15);
        treeImplementation.add(1);
        treeImplementation.preOrderTree(); // 9 4 1 6 20 15 170
        System.out.println();
        treeImplementation.inOrderTree(); // 1 4 6 9 15 20 170
        System.out.println();
        treeImplementation.postOrderTree(); // 1 6 4 15 170 20 9
    }

}

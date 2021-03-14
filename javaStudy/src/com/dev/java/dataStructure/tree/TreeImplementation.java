package com.dev.java.dataStructure.tree;

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

    // searching in bst
    boolean find(int data) {
        Node currentNode = root;
        if (currentNode == null) {
            return false;
        }
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            if (data < currentNode.data) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return false;
    }

    boolean findRecursive (Node node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (data < node.data) {
            return findRecursive(node.left, data);
        } else {
            return findRecursive(node.right, data);
        }
    }

    public static Node getTree() {
        TreeImplementation treeImplementation = new TreeImplementation();
        treeImplementation.add(9);
        treeImplementation.add(4);
        treeImplementation.add(6);
        treeImplementation.add(20);
        treeImplementation.add(170);
        treeImplementation.add(15);
        treeImplementation.add(1);
        return treeImplementation.root;
    }

    public static Node sampleTree() {
        // customizable tree for testing
        Node node = new Node();
        node.data = 10;
        Node leftNode = new Node();
        leftNode.data = 1;
        Node leftRightNode = new Node();
        leftRightNode.data = 15;
        leftNode.right = leftRightNode;
        node.left = leftNode;
        return node;
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
        System.out.println();
        System.out.println(treeImplementation.find(6)); // true
        System.out.println(treeImplementation.find(30)); // false
        System.out.println(treeImplementation.
                findRecursive(treeImplementation.root, 15)); // true
        System.out.println(treeImplementation.
                findRecursive(treeImplementation.root, 50)); // false
    }

}

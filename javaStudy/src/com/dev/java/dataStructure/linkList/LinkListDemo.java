package com.dev.java.dataStructure.linkList;

/**
 * Link list demo class
 */
public class LinkListDemo {
    public static void main(String[] args) {
        LinkListImplementation linkListImplementation = new LinkListImplementation();
        linkListImplementation.append(30);
        linkListImplementation.append(10);
        linkListImplementation.append(20);
        linkListImplementation.append(30);
        linkListImplementation.append(40);
        linkListImplementation.append(30);
        linkListImplementation.append(50);
        linkListImplementation.append(60);
//        linkListImplementation.printAllNodes();
        linkListImplementation.removeFromKList(30);
//        linkListImplementation.preAppend(50);
//        linkListImplementation.preAppend(60);
//        linkListImplementation.preAppend(20);
//        linkListImplementation.preAppend(10);
//        linkListImplementation.insertIndexAt(25, 20 );
//        linkListImplementation.delete(30);
//        linkListImplementation.printAllNodes();
    }
}

class Node {
    Node next;
    int value;
    public Node(int value) {
        this.value = value;
    }
}

class LinkListImplementation {

    Node head;

    public LinkListImplementation append(int value) {
        Node newNode = new Node(value);
        Node currentNode = this.head;
        if (this.head == null) {
            this.head = newNode;
            return this;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return this;
    }
    public LinkListImplementation removeFromKList(int testValue) {
        Node currentNode = this.head;
        Node node = null;
        while (currentNode != null) {
            if(currentNode.value != testValue) {
               Node newNode = new Node(currentNode.value);
               newNode.next = null;
               if(node == null) {
                   node = newNode;
               } else {
                   node.value = currentNode.value;
                   node.next = newNode;
               }
            }
            currentNode = currentNode.next;
        }
        return this;
    }

    public LinkListImplementation delete(int value) {
        if (this.head.value == value) {
            this.head = null;
            return this;
        }
        Node currentNode = this.head;
        Node prevNode = null;
        while (currentNode != null) {
            if(currentNode.value == value) {
                prevNode.next = currentNode.next;
                return this;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public LinkListImplementation preAppend(int value) {
        Node newNode = new Node(value);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
        return this;
    }

    public LinkListImplementation insertIndexAt(int value, int placeValue) {
        Node newNode = new Node(value);
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == placeValue) {
                Node nextNode = currentNode.next;
                newNode.next = nextNode;
                currentNode.next = newNode;
                return this;
            }
            currentNode = currentNode.next;
        }
        return this;
    }

    public void printAllNodes() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}

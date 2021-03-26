package com.dev.java.dataStructure.linkList;

/**
 *
 */
class LinkNode {
    int data;
    LinkNode next;
    LinkNode prev;
    public LinkNode(){
    }
    public LinkNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/**
 *
 */
public class DoublyLinkList {
    LinkNode head;

    /**
     *
     * @param data
     */
    void add(int data) {
        LinkNode linkNode = new LinkNode(data);
        if (head == null) {
            head = linkNode;
            return;
        }
        LinkNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                linkNode.prev = currentNode;
                currentNode.next = linkNode;
                currentNode = linkNode;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    void printList () {
        LinkNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.add(10);
        doublyLinkList.add(20);
        doublyLinkList.add(30);
        doublyLinkList.add(40);
        doublyLinkList.printList();
    }
}

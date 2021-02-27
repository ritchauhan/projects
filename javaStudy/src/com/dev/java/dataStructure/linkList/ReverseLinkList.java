package com.dev.java.dataStructure.linkList;

public class ReverseLinkList {

    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode reverseNode = null;
        while(currentNode != null) {
            ListNode newNode = new ListNode(currentNode.val, reverseNode);
            reverseNode = newNode;
            currentNode = currentNode.next;

        }
        return reverseNode;
    }

}


// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


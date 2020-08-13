package com.leetcode.iege.solution.topinterview.easy.linkedlist;

import datastructure.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNNodeFromListEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prevNode = head;
        ListNode currentNode = head;
        for (int i = 1; i <= n; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            return head.next;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            prevNode = prevNode.next;
        }

        ListNode removedNode = prevNode.next;
        prevNode.next = removedNode.next;

        return head;
    }

    public static void main(String[] args) {

    }
}

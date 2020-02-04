package com.leetcode.iege.solution.topinterview.linkedlist;

import datastructure.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        return reverse(null, head);
    }

    public ListNode reverse(ListNode current, ListNode next) {
        ListNode newNext = next.next;
        next.next = current;

        if (newNext == null) {
            return next;
        }

        return reverse(next, newNext);
    }
}

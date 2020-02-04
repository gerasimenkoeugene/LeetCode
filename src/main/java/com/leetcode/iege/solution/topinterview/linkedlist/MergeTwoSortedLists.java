package com.leetcode.iege.solution.topinterview.linkedlist;

import datastructure.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = l1.val < l2.val ? l1 : l2;
        if (l1.val < l2.val ) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }

        merge(head, l1, l2);

        return head;
    }

    private void merge(ListNode current, ListNode l1, ListNode l2)  {
        if (l1 == null && l2 == null) {
            return ;
        } else {
            if (l1 == null) {
                current.next = l2;
                l2 = l2.next;
            } else if(l2 == null) {
                current.next = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val ) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
            }
            merge(current.next, l1, l2);
        }
    }
}

package com.leetcode.iege.solution;

import datastructure.ListNode;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalListNode = new ListNode((l1.val + l2.val) % 10);
        ListNode currentListNode = finalListNode;
        int divisionResultOnTen = (l1.val + l2.val) / 10;
        while (!(l1.next == null && l2.next == null)) {
            if (currentListNode != finalListNode)
                currentListNode = new ListNode((l1.val + l2.val) % 10 + divisionResultOnTen);
            divisionResultOnTen = (l1.val + l2.val) / 10;
            if (l1.next != null) l1 = l1.next;
            if (l2.next != null) l2 = l2.next;

        }

        return finalListNode;
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode4;
        listNode4.next = listNode3;

        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode44 = new ListNode(4);
        listNode5.next = listNode6;
        listNode6.next = listNode44;

        System.out.println(new AddTwoNumbers2().addTwoNumbers(listNode2, listNode5));
    }
}

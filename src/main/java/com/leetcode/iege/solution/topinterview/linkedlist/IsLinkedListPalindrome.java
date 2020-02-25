package com.leetcode.iege.solution.topinterview.linkedlist;

import datastructure.ListNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsLinkedListPalindrome {


    private ListNode createListOfListNodes(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode currentNode = new ListNode(arr[1]);
        head.next = currentNode;
        for (int i = 2; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        return head;
    }

    private boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode prepre = null, pre = null;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        ListNode p2 = slow.next;
        slow.next = pre;
        ListNode p1 = fast == null ? slow.next : slow;
        while (p1 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        final Process p = Runtime.getRuntime().exec("ping -c 3 google.com");

        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
        List<String> lines = input.lines().collect(Collectors.toList());
        System.out.println(lines.stream().skip(lines.size() - 2).collect(Collectors.joining(", ")));
    }
}

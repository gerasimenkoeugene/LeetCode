package com.leetcode.iege.solution.topinterview.easy.design;

import datastructure.ListNode;

public class MinStack {
    int min = Integer.MAX_VALUE;
    ListNode top;

    public MinStack() {
    }

    public void push(int x) {
        ListNode newTop = new ListNode(x);
        newTop.next = top;
        top = newTop;

        if (min != Integer.MAX_VALUE && x < min) {
            min = x;
        }
    }

    public void pop() {
        if (top.val == min) {
            min = Integer.MAX_VALUE;
        }
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        if (min == Integer.MAX_VALUE) {
            ListNode node = top;
            while (node != null) {
                if (node.val < min) {
                    min = node.val;
                }
                node = node.next;
            }
        }
        return min;
    }
}

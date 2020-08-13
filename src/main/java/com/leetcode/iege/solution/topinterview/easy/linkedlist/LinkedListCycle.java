package com.leetcode.iege.solution.topinterview.easy.linkedlist;

import datastructure.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();

        int position = 0;
        while (head != null) {
            map.put(head, position);
            position++;
            head = head.next;
            if (map.containsKey(head)) {
                return true;
            }
        }

        return false;
    }


}

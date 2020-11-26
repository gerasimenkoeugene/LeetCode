package com.leetcode.iege.solution.topinterview.easy.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    static Map<Character, Character> map = new HashMap<>();
    static {
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }
    public boolean isValid(String s) {

        Stack<Character> open = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (open.empty() || !map.get(c).equals(open.pop())) {
                    return false;
                }
            } else {
                open.push(c);
            }
        }

        return open.empty();
    }
}

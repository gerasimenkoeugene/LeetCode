package com.leetcode.iege.solution.string.easy;

/**
 * You are given a string s, return the number of segments in the string.
 *
 * A segment is defined to be a contiguous sequence of non-space characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
 * Example 2:
 *
 * Input: s = "Hello"
 * Output: 1
 * Example 3:
 *
 * Input: s = "love live! mu'sic forever"
 * Output: 4
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 */
public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && flag) {
                count++;
                flag = false;
            } else if (s.charAt(i) != ' ') {
                flag = true;
            }
        }

        return count + (flag ? 1 : 0);
    }
}

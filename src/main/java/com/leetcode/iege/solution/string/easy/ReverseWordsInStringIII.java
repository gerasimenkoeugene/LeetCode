package com.leetcode.iege.solution.string.easy;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving
 * whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 */
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        String res = "";

        for (int i = s.length() - 1; i>=0; i--) {

            StringBuilder w = new StringBuilder();
            while(i >= 0 && s.charAt(i) != ' ') {
                w.append(s.charAt(i));
                i--;
            }
            if (i == -1) {
                return w + res;
            }
            res = " " + w + res;

        }

        return res;
    }
}

package com.leetcode.iege.solution.string.easy;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aba"
 * Output: true
 * Example 2:
 *
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3:
 *
 * Input: s = "abc"
 * Output: false
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        return check(s, false);
    }

    private boolean check(String s, boolean removed) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (removed) return false;
                return check(s.substring(l, r), true) || check(s.substring(l + 1, r + 1), true);
            }
            l++;
            r--;
        }

        return true;
    }
}

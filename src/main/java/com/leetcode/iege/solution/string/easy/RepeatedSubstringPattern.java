package com.leetcode.iege.solution.string.easy;

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 * Input: s = "aba"
 * Output: false
 * Example 3:
 *
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) return true;

        int n = s.length();
        for (int len = 1; len <= n/2; len++) { // pattern must repeat at least twice, i.e. pattern length is at most n/2
            if (n % len != 0) continue; // s length must can be divided by the pattern length

            String pattern = s.substring(0, len);
            int i = len; // start index of 2nd pattern
            int j = i + len - 1; // end index of 2nd pattern
            while (j < n) {
                String subStr = s.substring(i, j + 1);
                if (!subStr.equals(pattern)) break; // failed for this pattern, try next pattern
                i += len;
                j += len;
            }

            // if it past the last substring check, i will be n
            if(i == n) return true;
        }

        return false;
    }
}

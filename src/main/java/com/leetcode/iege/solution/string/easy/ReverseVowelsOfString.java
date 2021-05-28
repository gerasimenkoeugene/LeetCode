package com.leetcode.iege.solution.string.easy;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfString {

    public String reverseVowels(String s) {

        StringBuilder res = new StringBuilder(s);

        for (int i = 0, j = s.length() -1; i < j; i++, j--) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                res.setCharAt(i, s.charAt(j));
                res.setCharAt(j, s.charAt(i));
            } else if (isVowel(s.charAt(i))) {
                i--;
            } else if (isVowel(s.charAt(j))) {
                j++;
            }
        }
        return res.toString();
    }

    private boolean isVowel(Character ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            return true;
        }
        return false;
    }
}

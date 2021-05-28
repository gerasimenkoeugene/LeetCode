package com.leetcode.iege.solution.string.easy;

/**
 * Given a string s, return the "reversed" string where all characters that are not a letter stay in
 * the same place, and all letters reverse their positions.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 *
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * Example 3:
 *
 * Input: s = "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        StringBuilder res = new StringBuilder(s);

        for (int i=0,j=s.length()-1; i < j; i++,j--) {
            if (Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))) {
                res.setCharAt(i, s.charAt(j));
                res.setCharAt(j, s.charAt(i));
            } else if (Character.isLetter(s.charAt(i))) {
                i--;
            } else if (Character.isLetter(s.charAt(j))) {
                j++;
            }
        }

        return res.toString();
    }
}

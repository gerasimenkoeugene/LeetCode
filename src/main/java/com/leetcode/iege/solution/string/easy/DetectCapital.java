package com.leetcode.iege.solution.string.easy;

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "USA"
 * Output: true
 * Example 2:
 *
 * Input: word = "FlaG"
 * Output: false
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        boolean isUpperCase = Character.isUpperCase(word.charAt(1));
        int i = isUpperCase ? 0 : 1;
        for(; i < word.length(); i++) {
            if (isUpperCase && !Character.isUpperCase(word.charAt(i))) {
                return false;
            }
            if (!isUpperCase && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

package com.leetcode.iege.solution.string.easy;

/**
 * Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.
 *
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and
 * swapping the characters at a[i] and a[j].
 *
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 *
 *
 * Example 1:
 *
 * Input: a = "ab", b = "ba"
 * Output: true
 * Explanation: You can swap a[0] = 'a' and a[1] = 'b' to get "ba", which is equal to b.
 * Example 2:
 *
 * Input: a = "ab", b = "ab"
 * Output: false
 * Explanation: The only letters you can swap are a[0] = 'a' and a[1] = 'b', which results in "ba" != b.
 * Example 3:
 *
 * Input: a = "aa", b = "aa"
 * Output: true
 * Explanation: You can swap a[0] = 'a' and a[1] = 'a' to get "aa", which is equal to b.
 * Example 4:
 *
 * Input: a = "aaaaaaabc", b = "aaaaaaacb"
 * Output: true
 */
public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())  return false;

        if (A.equals(B)) {
            int[] charCount = new int['z' + 1];
            for (int i = A.length() - 1; i >= 0; i--)
                if (charCount[A.charAt(i)]++ > 0)return true;
            return false;
        }
        char[] ac = A.toCharArray();
        char[] bc = B.toCharArray();
        int first = ac.length - 1;
        while (first >= 0 && ac[first] == bc[first])  first--;

        int second = first - 1;
        while (second >= 0 && ac[second] == bc[second])  second--;
        if (second < 0 || ac[first] != bc[second] || ac[second] != bc[first])  return false;

        int rest = second - 1;
        while (rest >= 0 && ac[rest] == bc[rest])  rest--;
        return rest < 0;

    }

}

package com.leetcode.iege.solution.array.easy;

/**
 * We have two special characters. The first character can be represented by one bit 0.
 * The second character can be represented by two bits (10 or 11).
 * <p>
 * Now given a string represented by several bits. Return whether the last character must be
 * a one-bit character or not. The given string will always end with a zero.
 * <p>
 * Example 1:
 * Input:
 * bits = [1, 0, 0]
 * Output: True
 * Explanation:
 * The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
 * Example 2:
 * Input:
 * bits = [1, 1, 1, 0]
 * Output: False
 * Explanation:
 * The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.
 */
public class OneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        boolean res = false;
        for (int i = 0; i < bits.length; ) {
            if (i == bits.length - 1) {
                res = true;
            }
            if (bits[i] == 1) {
                i = i + 2;
            } else {
                i++;
            }
        }
        return res;
    }
}

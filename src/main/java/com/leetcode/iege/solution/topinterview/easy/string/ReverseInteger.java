package com.leetcode.iege.solution.topinterview.easy.string;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Input: 123
 * Output: 321
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int sign = x < 0 ? -1 : 1;
        String intString = String.valueOf(x).substring(x < 0 ? 1 : 0);
        String reversed =  new StringBuilder(intString).reverse().toString();

        try {
            return Integer.valueOf(reversed) * sign;
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-2147483648));
    }
}

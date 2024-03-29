package com.leetcode.iege.solution.string.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while( i >= 0 || j >= 0) {
            int sum = carry;
            if(i>=0)sum += a.charAt(i) - '0'; //converts to num;
            if(j>=0)sum += b.charAt(j) - '0';
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry != 0)sb.append(carry);
        return sb.reverse().toString();
    }

}

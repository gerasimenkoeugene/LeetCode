package com.leetcode.iege.solution.string.easy;

/**
 * x is a good number if after rotating each digit individually by 180 degrees, we get
 * a valid number that is different from x. Each digit must be rotated - we cannot choose to leave it alone.
 *
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves;
 * 2 and 5 rotate to each other (on this case they are rotated in a different direction, in other words 2 or 5 gets mirrored);
 * 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.
 *
 * Now given a positive number n, how many numbers x from 1 to n are good?
 *
 * Example:
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 */
public class RotatedDigits {


    public int rotatedDigits(int n) {

        int res = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            boolean valid = false;
            while(num > 0) {
                int l = num % 10;
                if (l == 3 || l == 4 || l == 7) {
                    valid = false;
                    break;
                }
                if (l == 2 || l == 5 || l == 6 || l == 9) {
                    valid = true;
                }
                num /= 10;
            }
            res += valid ? 1 : 0;

        }
        return res;
    }
}

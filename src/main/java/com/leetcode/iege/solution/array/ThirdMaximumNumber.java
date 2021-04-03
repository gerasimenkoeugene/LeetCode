package com.leetcode.iege.solution.array;

/*
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.

Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        final double BASE_VALUE = ((double) Integer.MIN_VALUE) - 1;
        double firstMax = BASE_VALUE;
        double secMax = BASE_VALUE;
        double thirdMax = BASE_VALUE;
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secMax;
                secMax = firstMax;
                firstMax = num;
            }
            else if (num > secMax && num < firstMax) {
                thirdMax = secMax;
                secMax = num;
            }
            else if (num > thirdMax && num < firstMax && num < secMax) {
                thirdMax = num;
            }
        }
        return thirdMax == BASE_VALUE ? (int) firstMax : (int) thirdMax;
    }
}

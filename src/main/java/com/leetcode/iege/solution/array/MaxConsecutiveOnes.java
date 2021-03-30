package com.leetcode.iege.solution.array;

/*
    Given a binary array, find the maximum number of consecutive 1s in this array.

    Example 1:
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                result++;
            } else {
                max = Math.max(result, max);
                result = 0;
            }
        }

        return Math.max(result, max);
    }
}

package com.leetcode.iege.solution.array.easy;

/**
 * You are given an integer array nums where the largest integer is unique.
 *
 * Determine whether the largest element in the array is at least twice as much as every
 * other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,6,1,0]
 * Output: 1
 * Explanation: 6 is the largest integer.
 * For every other number in the array x, 6 is at least twice as big as x.
 * The index of value 6 is 1, so we return 1.
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: -1
 * Explanation: 4 is less than twice the value of 3, so we return -1.
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 0
 * Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {

        int currMax = 0;
        int position = -1;
        int nextMax = -1;

        for (int i = 0; i < nums.length; i++) {
            if (currMax < nums[i]) {
                nextMax = currMax;
                currMax = nums[i];
                position = i;
            } else if (nextMax < nums[i] ) {
                nextMax = nums[i];
            }

        }

        if ((nextMax == 0 && currMax != 0) || currMax / nextMax >= 2 || nextMax == -1) {
            return position;
        }

        return -1;
    }
}

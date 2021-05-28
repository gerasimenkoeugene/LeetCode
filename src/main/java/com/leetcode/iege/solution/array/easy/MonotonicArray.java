package com.leetcode.iege.solution.array.easy;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 *
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
 * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 *
 * Return true if and only if the given array nums is monotonic.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3]
 * Output: true
 * Example 2:
 *
 * Input: nums = [6,5,4,4]
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,3,2]
 * Output: false
 * Example 4:
 *
 * Input: nums = [1,2,4,5]
 * Output: true
 * Example 5:
 *
 * Input: nums = [1,1,1]
 * Output: true
 */
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int flag = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if(flag == -1 && nums[i] < nums[i + 1]) {
                return false;
            }
            if(flag == 1 && nums[i] > nums[i + 1]) {
                return false;
            }
            if (flag == 0) {
                if (nums[i] < nums[i + 1]) {
                    flag = 1;
                }
                if (nums[i] > nums[i + 1]) {
                    flag = -1;
                }
            }
        }

        return true;
    }
}

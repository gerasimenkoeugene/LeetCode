package com.leetcode.iege.solution.array;

/*
Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0],
 your answer will be accepted.

 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i - result] = nums[i];
            if (nums[i] == val) {
                result++;
            }
        }

        return nums.length - result;
    }
}

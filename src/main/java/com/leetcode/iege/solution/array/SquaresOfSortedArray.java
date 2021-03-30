package com.leetcode.iege.solution.array;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int i = nums.length - 1;
        while(left <= right) {
            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i--] = nums[right] * nums[right];
                right--;
            }
            else {
                result[i--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}

package com.leetcode.iege.solution.topinterview.easy.dynamicprogramming;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int cummulative =  Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cummulative < -nums[i]) {
                cummulative = nums[i];
                max = Math.max(max, cummulative);
            } else {
                cummulative = cummulative < 0 ? 0 : cummulative;
                cummulative = cummulative + nums[i];
                max = Math.max(max, cummulative);
            }
        }
        return Math.max(max, cummulative);
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int []{-1, -2}));
    }
}

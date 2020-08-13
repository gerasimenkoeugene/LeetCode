package com.leetcode.iege.solution.topinterview.easy.dynamicprogramming;

/*
You are a professional robber planning to rob houses along a street.
 Each house has a certain amount of money stashed, the only constraint stopping you from robbing
 each of them is that adjacent houses have security system connected and it will automatically
 contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return n;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        int maxLooted = Integer.MIN_VALUE;
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max((dp[i - 2] + nums[i]), (dp[i - 1]));
            maxLooted = Math.max(dp[i], maxLooted);
        }
        return maxLooted;
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[]{20, 30, 9, 3, 5}));
    }
}

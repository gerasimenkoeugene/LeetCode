package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.Arrays;
import java.util.Collections;

/*
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.

Note:

Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Input: [4,1,2,1,2]
Output: 4

 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i= i + 2) {
            if (nextNumberIsNotEqualCurrent(i, nums)) {
                return nums[i];
            }
        }
        return 1;
    }

    private boolean nextNumberIsNotEqualCurrent(int counter, int [] nums) {
        if (counter + 1 >= nums.length) {
            return true;
        } else {
            return nums[counter] != nums[counter + 1];
        }
    }

    public int singleNumberBest(int[] nums) {
        int a = 0;
        for (int i=0;i<nums.length;i++){
            a = nums[i]^a;
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumberBest(new int[]{5,5,3,4,3,4,5}));
    }
}

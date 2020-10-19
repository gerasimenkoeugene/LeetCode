package com.leetcode.iege.solution.topinterview.easy.array;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                i++;
            } else if (nums[i] != 0 && i != j) {
                nums[j] = nums[i];
                j++;
                i++;
            } else {
                j++;
                i++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}

package com.leetcode.iege.solution.array;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumberDigits(nums[i])) {
                result++;
            }
        }
        return result;
    }

    private boolean isEvenNumberDigits(int num) {
        int digitsCount = 0;
        while(num != 0) {
            num = num / 10;
            digitsCount++;
        }

        return digitsCount % 2 == 0;
    }
}

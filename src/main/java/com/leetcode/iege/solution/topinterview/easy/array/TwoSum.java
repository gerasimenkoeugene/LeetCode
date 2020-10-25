package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (diffMap.containsKey(nums[i])) {
                return new int[]{diffMap.get(nums[i]), i};
            }
            diffMap.put(diff, i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}

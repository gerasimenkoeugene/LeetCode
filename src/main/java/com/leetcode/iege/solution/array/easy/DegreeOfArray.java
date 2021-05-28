package com.leetcode.iege.solution.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as
 * the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 */
public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        int res = Integer.MAX_VALUE;
        int max = 1;
        Map<Integer, Integer> firstPos = new HashMap<>();
        Map<Integer, Integer> lastPos = new HashMap<>();
        Map<Integer, Integer> resNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!firstPos.containsKey(num)) {
                firstPos.put(num, i);
            }
            lastPos.put(num, i);

            if (resNums.containsKey(num)) {
                int curr = resNums.get(num) + 1;
                max = Math.max(max, curr);

                resNums.put(num, curr);
            } else {
                resNums.put(num, 1);
            }

        }

        if (max == 1) {
            return 1;
        }

        for (Integer num : resNums.keySet()) {
            int numVal = resNums.get(num);
            if (numVal == max) {
                res = Math.min(res, lastPos.get(num) - firstPos.get(num) + 1);
            }
        }

        return res;
    }
}

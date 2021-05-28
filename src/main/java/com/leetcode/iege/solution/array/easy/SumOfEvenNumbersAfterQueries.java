package com.leetcode.iege.solution.array.easy;

import java.util.ArrayList;

/**
 * We have an array nums of integers, and an array queries of queries.
 *
 * For the i-th query val = queries[i][0], index = queries[i][1], we add val to nums[index].
 * Then, the answer to the i-th query is the sum of the even values of A.
 *
 * (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array nums.)
 *
 * Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * Output: [8,6,2,4]
 * Explanation:
 * At the beginning, the array is [1,2,3,4].
 * After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
 * After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
 * After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
 * After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 */
public class SumOfEvenNumbersAfterQueries {



    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        ArrayList<Integer> arr=new ArrayList<Integer>(nums.length);
        int sum = 0;
        int [] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int [] q = queries[i];

            if(nums[q[1]] % 2 == 0) {

                if (q[0] % 2 == 0) {
                    sum += q[0];
                } else {
                    sum -= nums[q[1]];
                }
            } else {
                if (q[0] % 2 != 0) {
                    sum += nums[q[1]] + q[0];
                }
            }
            nums[q[1]] += q[0];
            res[i] = sum;
        }

        return res;
    }
}

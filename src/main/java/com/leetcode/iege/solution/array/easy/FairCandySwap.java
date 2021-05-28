package com.leetcode.iege.solution.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Alice and Bob have candy bars of different sizes: aliceSizes[i] is the size of the i-th bar of candy that Alice has,
 * and bobSizes[j] is the size of the j-th bar of candy that Bob has.
 *
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange,
 * they both have the same total amount of candy.  (The total amount of candy a person has is the sum
 * of the sizes of candy bars they have.)
 *
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange,
 * and ans[1] is the size of the candy bar that Bob must exchange.
 *
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 *
 *
 *
 * Example 1:
 *
 * Input: aliceSizes = [1,1], bobSizes = [2,2]
 * Output: [1,2]
 * Example 2:
 *
 * Input: aliceSizes = [1,2], bobSizes = [2,3]
 * Output: [1,2]
 * Example 3:
 *
 * Input: aliceSizes = [2], bobSizes = [1,3]
 * Output: [2,3]
 * Example 4:
 *
 * Input: aliceSizes = [1,2,5], bobSizes = [2,4]
 * Output: [5,4]
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        for (int aliceSize : aliceSizes) {
            sumAlice += aliceSize;
        }
        for (int bobSize : bobSizes) {
            sumBob += bobSize;
        }
        int swap = (sumBob - sumAlice) / 2;
        Set<Integer> bobSet = new HashSet<Integer>();
        for (int bobSize : bobSizes) {
            bobSet.add(bobSize);
        }
        for (int aliceSize : aliceSizes) {
            if (bobSet.contains(aliceSize + swap)) {
                return new int[]{aliceSize, aliceSize+swap};
            }
        }
        return null;
    }
}

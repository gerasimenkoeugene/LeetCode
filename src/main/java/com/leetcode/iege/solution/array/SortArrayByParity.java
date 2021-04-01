package com.leetcode.iege.solution.array;

/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int i = 0,j = 0;
        int temp = 0;
        while (i < A.length) {
            if (A[i] % 2 == 0) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
            i++;
        }
        return A;
    }
}

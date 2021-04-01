package com.leetcode.iege.solution.array;

/*
Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > max) {
                int tmp = arr[i];
                arr[i] = max;
                max = tmp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}

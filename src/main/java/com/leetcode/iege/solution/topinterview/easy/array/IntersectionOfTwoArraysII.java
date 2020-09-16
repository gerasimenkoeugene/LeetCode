package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.*;

/*
Given two arrays, write a function to compute their intersection.
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 ) return nums1;
        if(nums2.length == 0) return nums2;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;int j=0; int k=0;

        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else if(nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;

            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}

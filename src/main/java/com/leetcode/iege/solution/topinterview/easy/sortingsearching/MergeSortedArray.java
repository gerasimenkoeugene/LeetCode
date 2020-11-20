package com.leetcode.iege.solution.topinterview.easy.sortingsearching;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1, p2=n-1;
        int curr=nums1.length-1;
        while(p2>=0 && curr>=0) {

            if(p1<0 || nums2[p2] >= nums1[p1]) {
                nums1[curr] = nums2[p2];
                p2--;
            } else {
                nums1[curr] = nums1[p1];
                p1--;
            }
            curr--;
        }
    }
}

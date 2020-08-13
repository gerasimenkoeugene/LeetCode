package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {

//    public int removeDuplicates(int[] nums) {
//        Set<Integer> unique = new HashSet<>();
//        for (int i = 0, j = 0; i < nums.length;) {
//            if (unique.contains(nums[i])) {
//                i++;
//                continue;
//            }  else {
//                nums[j] = nums[i];
//                unique.add(nums[i]);
//                i++;
//                j++;
//            }
//        }
//        return unique.size();
//    }

    public int removeDuplicates(int[] nums) {
        return calculatePosition(nums, 0, nums.length - 1, 0);
    }

    private int calculatePosition(int[] nums, int left, int right, int position) {
        if (nums[left] == nums[right]) {
            if (position - 1 >= 0 && nums[position - 1] == nums[left]) {
                return position;
            }
            nums[position] = nums[left];
            return ++position;
        } else {
            int middle = left + (right - left) / 2;
            int newPosition = calculatePosition(nums, left, middle, position);
            return calculatePosition(nums, middle + 1, right, newPosition);
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.printf(Arrays.toString(nums));
    }
}

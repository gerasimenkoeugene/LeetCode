package com.leetcode.iege.solution.topinterview.easy.tree;

import datastructure.TreeNode;
//Given the sorted array: [-10,-3,0,5,9],
//
//        One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//         0
//        / \
//      -3   9
//     /   /
//   -10  5
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getRootNode(nums, 0, nums.length - 1);
    }

    private TreeNode getRootNode(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }
        int index = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[index]);
        node.left = getRootNode(nums, left, index - 1);
        node.right = getRootNode(nums, index + 1 , right);
        return node;
    }
}

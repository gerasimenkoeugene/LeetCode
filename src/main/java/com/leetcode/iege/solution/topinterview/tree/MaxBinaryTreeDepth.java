package com.leetcode.iege.solution.topinterview.tree;

import datastructure.TreeNode;

public class MaxBinaryTreeDepth {

    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    private int getDepth(TreeNode treeNode, int level) {
        if (treeNode == null) {
            return level;
        } else {
            level++;
            return Math.max(getDepth(treeNode.left, level), getDepth(treeNode.right, level));
        }
    }
}

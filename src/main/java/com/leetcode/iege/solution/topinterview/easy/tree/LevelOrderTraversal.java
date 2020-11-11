package com.leetcode.iege.solution.topinterview.easy.tree;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//         3
//        / \
//       9  20
//        /  \
//        15   7
//        return its level order traversal as:
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();
        fillData(root, 0, mainList);
        return mainList;
    }

    private void fillData(TreeNode node, Integer depth, List<List<Integer>> mainList) {
        if (node == null) {
            return;
        }
        if (depth > mainList.size() - 1) {
            mainList.add(new ArrayList<>());
        }
        mainList.get(depth).add(node.val);
        depth++;
        fillData(node.left, depth, mainList);
        fillData(node.right, depth, mainList);
    }

}

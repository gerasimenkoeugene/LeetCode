package com.leetcode.iege.solution.topinterview.easy.tree;

import datastructure.TreeNode;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//        1
//        / \
//        2   2
//        / \ / \
//        3  4 4  3

public class IsSymmetric {

    public static boolean isSymm(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if((t1 == null && t2 != null)||(t2 == null && t1 != null)){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        return isSymm(t1.left, t2.right) && isSymm(t1.right, t2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymm(root.left, root.right);

    }
}

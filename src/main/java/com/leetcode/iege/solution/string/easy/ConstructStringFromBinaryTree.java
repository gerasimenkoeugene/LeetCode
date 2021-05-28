package com.leetcode.iege.solution.string.easy;

import datastructure.TreeNode;

/**
 * Given the root of a binary tree, construct a string consists of parenthesis and integers from a binary tree
 * with the preorder traversing way, and return it.
 *
 * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string
 * and the original binary tree.
 *
 * Input: root = [1,2,3,4]
 * Output: "1(2(4))(3)"
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 * but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
 *
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        res(t,sb);
        return sb.toString();
    }

    private void res(TreeNode t, StringBuilder sb) {
        sb.append(t.val);
        if(t.left==null&&t.right==null){
            return;
        }
        if(t.left!=null){
            sb.append("(");
            res(t.left,sb);
            sb.append(")");
        }
        if(t.right!=null){
            if(t.left==null){
                sb.append("()");
            }
            sb.append("(");
            res(t.right,sb);
            sb.append(")");
        }
    }
}

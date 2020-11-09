package com.leetcode.iege.solution.topinterview.easy.tree;

import datastructure.TreeNode;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class IsValidBst {

    public boolean isValidBST2(TreeNode root) {
        return checkNode(root, new HashSet<>(), new HashSet<>());
    }

    private boolean checkNode(TreeNode node, Set<Integer> less, Set<Integer> more) {

        if (node == null) {
            return true;
        }
        System.out.println(node.val);
        System.out.println(less);
        System.out.println(more);
        System.out.println("------");

        if (checkLess(node, less)) {
            return false;
        }
        less.add(node.val);
        boolean leftResult = checkNode(node.left, less, more);
        less.remove(node.val);

        if(checkMore(node, more)) {
            return false;
        }
        more.add(node.val);
        boolean rightResult = checkNode(node.right, less, more);
        more.remove(node.val);

        return leftResult && rightResult;

    }

    private boolean checkLess(TreeNode node, Set<Integer> less) {
        return less.stream().anyMatch(integer -> integer <= node.val);
    }

    private boolean checkMore(TreeNode node, Set<Integer> more) {
        return more.stream().anyMatch(integer -> integer >= node.val);
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    public boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        Set<Integer> less = new HashSet<>();

        less.stream().anyMatch(integer -> integer > root.val);

    }
}

package com.leetcode.iege.solution.topinterview.easy.dynamicprogramming;

public class ClimbingStairsRecursive {

    public int climbStairs(int n) {
        int oneStair = countSteps(n - 1, 0);
        int result = countSteps(n - 2, oneStair);
        return result;
    }

    private int countSteps(int stairsAmount, int result) {
        if (stairsAmount == 0) {
            return ++result;
        }
        if (stairsAmount < 0) {
            return result;
        }
        int oneStair = countSteps(stairsAmount - 1, result);
        int twoStair = countSteps(stairsAmount - 2, oneStair);
        return twoStair;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairsRecursive().climbStairs(2));
    }
}

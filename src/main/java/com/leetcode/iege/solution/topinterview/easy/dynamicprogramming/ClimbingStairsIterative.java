package com.leetcode.iege.solution.topinterview.easy.dynamicprogramming;

public class ClimbingStairsIterative {

    public int climbStairs(int n) {
        if(n < 2)
            return 1;
        int one = 1, two = 1, total = 0;
        for(int i = 2; i <= n; i++) {
            total = one + two;
            one = two;
            two = total;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairsIterative().climbStairs(2));
    }
}

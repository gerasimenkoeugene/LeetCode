package com.leetcode.iege.solution.array.easy;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
public class FibonacciNumber {

    public int fib(int n) {
        if(n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public int fibArr(int n) {

        if(n==0) return 0;
        if(n==1) return 1;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
}

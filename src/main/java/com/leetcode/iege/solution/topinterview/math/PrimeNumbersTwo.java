package com.leetcode.iege.solution.topinterview.math;

public class PrimeNumbersTwo {

    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];

        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (isNotPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isNotPrime[j] = true;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) count++;
        }
        return count;
    }
}

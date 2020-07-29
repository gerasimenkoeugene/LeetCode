package com.leetcode.iege.solution.topinterview.math;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {

    private static Set<Integer> primeNumbers = new HashSet<>(Arrays.asList( 2, 3, 5, 7));

    public int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        if (primeNumbers.contains(number)) {
            return true;
        }
        for (int primeNumber : primeNumbers) {
            if (number % primeNumber == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumbers().countPrimes(122));
        System.out.println(new PrimeNumbers().isPrime(121));
    }
}

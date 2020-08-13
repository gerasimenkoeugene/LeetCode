package com.leetcode.iege.solution.topinterview.easy.dynamicprogramming;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int result = 0;
        int max = 0;
        int min = prices[0];
        if (prices.length == 0) {
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = 0;
                continue;
            }
            if (prices[i] > max) {
                max = prices[i];
                result = result > max - min ? result : max - min;
            }
        }
        return result;
    }

    private boolean isNextBigger(int i, int[] prices) {
        if (i == prices.length - 1) {
            return false;
        } else {
            return prices[i] < prices[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] prices = new int[0];
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
    }
}

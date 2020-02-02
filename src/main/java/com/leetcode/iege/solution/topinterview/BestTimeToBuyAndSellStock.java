package com.leetcode.iege.solution.topinterview;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class BestTimeToBuyAndSellStock {
//
//    public int maxProfit(int[] prices) {
//        if (prices.length < 2) {
//            return 0;
//        }
//        int totalProfit = 0;
//        int bestProfit = 0;
//        for (int i = 0, j = 1; j < prices.length; ) {
//            if (prices[j] - prices[i] < 0) {
//                i = j;
//                totalProfit = totalProfit + bestProfit;
//                bestProfit = 0;
//            } else {
//                bestProfit = bestProfit > prices[j] - prices[i] ? bestProfit : prices[j] - prices[i];
//                j++;
//            }
//        }
//        return totalProfit > bestProfit ? totalProfit : bestProfit;
//    }

//    public int maxProfit(int[] prices) {
//        if (prices.length < 2) {
//            return 0;
//        }
//        int bestProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int currentProfit = calcProfit(prices, i, j);
//                bestProfit = Math.max(currentProfit, bestProfit);
//            }
//        }
//        return bestProfit;
//    }
//
//    private int calcProfit(int[] prices, int currentDay, int dayToSell) {
//        if (dayToSell >= prices.length) {
//            return 0;
//        } else {
//            int currentProfit = Math.max(prices[dayToSell] - prices[currentDay], 0);
//            if (currentProfit != 0) {
//                currentDay = dayToSell + 1;
//                dayToSell = dayToSell + 2;
//            } else {
//                dayToSell++;
//            }
//            int nextProfit = calcProfit(prices, currentDay, dayToSell);
//            return currentProfit + nextProfit;
//        }
//    }

    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {1,3,2,4,7};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
    }
}

package com.leetcode.dpmultidimension;

public class Stocks {

    public static void main(String[] args) {
        int[] prices = {1,3,7,5,10,3};
        System.out.println(maxProfit(prices, 3));
    }

    public static int maxProfit(int[] prices, int fee) {

        int buy = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length ; i++) {

            buy = Math.min(buy, prices[i] - sell );
            sell = Math.max(sell, prices[i] - buy - fee);
        }

        return sell;
    }
}
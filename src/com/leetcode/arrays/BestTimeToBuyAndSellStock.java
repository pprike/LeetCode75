package com.leetcode.arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int [] sample = {7,1,5,3,6,4};
        System.out.println(maxProfit(sample));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i=1; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (maxProfit < (prices[i] - minPrice)) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
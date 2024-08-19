package com.leetcode.dp1d;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

       int n1 = cost[0];
       int n2 = cost[1];
       int n3 = 0;

        for (int i = 2; i < cost.length; i++) {
            n3 = Math.min(n1, n2) + cost[i];
            n1 = n2;
            n2 = n3;
        }

        return Math.min(n1, n2);
    }
}
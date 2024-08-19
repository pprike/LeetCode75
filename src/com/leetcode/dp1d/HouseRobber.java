package com.leetcode.dp1d;

public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = {1000,1,100,500};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int includeMax = 0;
        int adjacentMax = nums[0];


        for (int i = 1; i < nums.length; i++) {
            int currentMax = Math.max(adjacentMax, includeMax+nums[i]);
            includeMax = adjacentMax;
            adjacentMax = currentMax;
        }

        return adjacentMax;

    }
}
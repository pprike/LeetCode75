package com.leetcode.arrays;

public class increasingTriplet {

    public static void main(String[] args) {
        int [] sample = { 5, 4, 3, 2, 1 };
        System.out.println(increasingTriplet(sample));
    }

    public static boolean increasingTriplet(int[] nums) {

        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= p1) {
                p1 = nums[i];
            } else if (nums[i] <= p2) {
                p2 = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
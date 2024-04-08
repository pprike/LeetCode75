package com.leetcode.prefixSum;

public class PivotIndexI {

    public static void main(String[] args) {
        int [] nums = {-1,-1,-1,-1,0,1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;

        for (int i : nums) {
            totalSum+=i;
        }

        rightSum = totalSum - nums[0];

        if (leftSum == rightSum) {
            return 0;
        }

        for (int k = 1; k < nums.length; k++) {

            leftSum+=nums[k-1];
            rightSum = totalSum - leftSum - nums[k];

            if (leftSum == rightSum) {
                return k;
            }
        }

        return -1;
    }
}
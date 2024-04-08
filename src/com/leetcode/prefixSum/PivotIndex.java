package com.leetcode.prefixSum;

public class PivotIndex {

    public static void main(String[] args) {
        int [] nums = {-1,-1,-1,-1,0,1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int i = -1;
        int j = nums.length;

        int leftSum = 0;
        int rightSum = 0;

        while (i+2 != j) {
            if (((leftSum < rightSum) && nums[i + 1] > 0) || ((leftSum > rightSum) && nums[i + 1] < 0)) {
                i++;
                leftSum += nums[i];
            } else if (((leftSum < rightSum) && nums[j-1] < 0) || ((leftSum > rightSum) && nums[j-1] > 0)) {
                j--;
                rightSum += nums[j];
            } else {
                i++;
                leftSum += nums[i];
            }
        }

        if (leftSum == rightSum) {
            return i+1;
        }
        return -1;
    }
}
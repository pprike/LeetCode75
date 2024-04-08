package com.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int [] sample = { 0,1,0,3,12 };
        moveZeroes(sample);
    }

    public static void moveZeroes(int[] nums) {

        int count = 0;
        int i = 0;

        while (count == 0 && i<nums.length) {
            if (nums[i] == 0) {
                count++;
            }
            i++;
        }

        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i-count] = nums[i];
                nums[i] = 0;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
    }
}

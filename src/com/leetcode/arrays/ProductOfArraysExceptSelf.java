package com.leetcode.arrays;

import java.util.HashMap;

public class ProductOfArraysExceptSelf {

    public static void main(String[] args) {

        int [] sample = { -1, 1, 0, -3, 3 };

        System.out.println(productOfArrayExceptSelf(sample));
    }

    public static int[] productOfArrayExceptSelf(int[] nums) {

        int i = 1;
        int totalProduct = nums[0];
        int zeroCounter = 0;


        while(i < nums.length) {
            if (nums[i] == 0 && zeroCounter == 0) {
                zeroCounter++;
                i++;
                continue;
            } else if (nums[i] == 0 && zeroCounter > 0) {
                totalProduct = 0;
                break;
            } else {
                totalProduct *= nums[i];
                i++;
            }
        }

        int [] result = new int[nums.length];

        for(int j=0; j<nums.length; j++) {

            if (zeroCounter > 1 || (nums[j] != 0 && zeroCounter == 1)) {
                result[j] = 0;
            } else if (nums[j] == 0 && zeroCounter == 1) {
                result[j] = totalProduct;
            } else  {
                result[j] = totalProduct/nums[j];
            }
        }

        return result;
    }
}

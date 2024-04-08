package com.leetcode.arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int [] sample = { 1, 2, 3, 4 };

        int [] resArr = productExceptSelf(sample);

        for(int i=0; i<resArr.length; i++) {
            System.out.println(resArr[i]);
        }
    }

    //Without Division Operator
    public static int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;

        int [] resArr = new int [nums.length];

        for(int i=0; i<nums.length; i++) {
            resArr[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        for(int j=nums.length-1; j>=0; j--) {
            resArr[j] = resArr[j] * rightProduct;
            rightProduct = rightProduct * nums[j];
        }

        return resArr;
    }
}

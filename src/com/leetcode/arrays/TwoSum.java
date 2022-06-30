package com.leetcode.arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int [] sample = { 2, 7, 11, 15 };

        System.out.println(twoSum(sample, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> parsedNumbers = new HashMap<>();

        int [] result = new int[2];

        for(int i=0; i<nums.length; i++) {

            int requiredNum = target - nums[i];

           if (parsedNumbers.containsKey(requiredNum)) {
              result[0] = parsedNumbers.get(requiredNum);
              result[1] = i;
              return result;
           } else {
               parsedNumbers.put(nums[i], i);
           }

        }

        return result;
    }
}

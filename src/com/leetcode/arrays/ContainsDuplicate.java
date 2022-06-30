package com.leetcode.arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] sample = {7,1,5,3,6,4};
        containsDuplicate(sample);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map =  new HashMap<>();

        for (int i=0; i< nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], nums[i]);
        }

        return false;
    }
}
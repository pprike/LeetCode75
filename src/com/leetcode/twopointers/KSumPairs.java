package com.leetcode.twopointers;

import java.util.HashMap;

public class KSumPairs {

    public static void main(String[] args) {

        int [] nums = {3,1,5,1,1,1,1,1,2,2,3,2,2};
        int k = 1;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> numMap = new HashMap<>();
        int totalPairs = 0;

        for (int n : nums) {

            int match = k - n;
            if (numMap.containsKey(match) && numMap.get(match) > 0) {
                numMap.put(match, numMap.get(match) - 1);
                totalPairs++;
                continue;
            } else {
                numMap.put(n, numMap.getOrDefault(n, 0) + 1);
            }
        }

        return totalPairs;
    }
}
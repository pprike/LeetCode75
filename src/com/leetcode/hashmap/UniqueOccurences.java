package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {

    public static void main(String[] args) {

        int [] nums1 = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(nums1));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> numMap = new HashMap<>();
        Set<Integer> countSet = new HashSet<>();

        for (int n1 : arr) {

            Integer count = numMap.get(n1);

            if (count != null) {
                numMap.put(n1, count+1);
                continue;
            }
            numMap.put(n1,1);
        }

        for (Integer i : numMap.values()) {
            countSet.add(i);
        }

        return numMap.keySet().size() == countSet.size();
    }
}
package com.leetcode.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDifference {

    public static void main(String[] args) {

        int [] nums1 = {-80,-15,-81,-28,-61,63,14,-45,-35,-10};
        int [] nums2 = {-1,-40,-44,41,10,-43,69,10,2};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int n1 : nums1) {
            diffMap.put(n1,1);
        }

        for (int n2 : nums2) {
            if (diffMap.containsKey(n2) && !diffMap.get(n2).equals(2)) {
                diffMap.put(n2, 0);
                continue;
            }
            diffMap.put(n2,2);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (Integer key: diffMap.keySet()) {
            if (diffMap.get(key).equals(1)) {
                list1.add(key);
            } else if (diffMap.get(key).equals(2)) {
                list2.add(key);
            }
        }

        List<List<Integer>> resList = new ArrayList<>();
        resList.add(list1);
        resList.add(list2);

        return resList;
    }
}
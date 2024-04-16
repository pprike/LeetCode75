package com.leetcode.hashmap;

import java.util.*;

public class EqualPairs {

    public static void main(String[] args) {
//        int[][] preReq = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int[][] preReq = {{3,1,2,2}, {1,4,4,4}, {2,4,2,2}, {2,5,2,2}};

        System.out.println(equalPairs(preReq));
    }

    public static int equalPairs(int[][] grid) {

        Map<String, Integer> allKeys = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuffer key = new StringBuffer();
            for (int j = 0; j < grid.length; j++) {
                key.append(grid[i][j]).append("-");
            }
            allKeys.put(key.toString(), (allKeys.getOrDefault(key.toString(), 0) + 1));
            key.delete(0, key.length());
        }

        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            StringBuffer key = new StringBuffer();
            for (int j = 0; j < grid.length; j++) {
                key.append(grid[j][i]).append("-");
            }

            final Integer val = allKeys.getOrDefault(key.toString(), 0);
            if (val == 0) {
                continue;
            }
            key.delete(0, key.length());
            result = result + val;
        }

        return result;
    }
}
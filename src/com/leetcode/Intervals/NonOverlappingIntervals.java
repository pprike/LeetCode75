package com.leetcode.Intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class NonOverlappingIntervals {

    public static void main(String[] args) {

        int [][] sample = { {1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println(eraseOverlapIntervals(sample));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        int removed = 0;
        int prevEnd  = intervals [0][1];

        for (int i = 1; i <intervals.length; i++) {
            if (intervals[i][0] >= prevEnd) {
                prevEnd = intervals[i][1];
            } else {
                removed++;
                prevEnd = Math.min(prevEnd, intervals[i][1]);
            }
        }

        return removed;
    }
}

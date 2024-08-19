package com.leetcode.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class BurstBallon {

    public static void main(String[] args) {

        int [][] sample = { {10,16}, {2,8}, {1,6}, {7,12} };
        System.out.println(findMinArrowShots(sample));
    }

    public static int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(x -> x[0]));

        int arrows = 1;
        int prevBallon  = points [0][1];

        for (int i = 1; i <points.length; i++) {
            if (points[i][0] > prevBallon) {
                prevBallon = points[i][1];
                arrows++;
            } else {
                prevBallon = Math.min(prevBallon, points[i][1]);
            }
        }

        return arrows;
    }
}

package com.leetcode;

import java.util.HashMap;

public class NumberOfBlocks {

    public static void main(String[] args) {

        int [] [] sample = { {0,0}, {1,1}, {0,2} };

       long [] res = countBlackBlocks(3,3, sample);

        for (long num : res) {
            System.out.println(num);
        }
    }

    public static long[] countBlackBlocks(int m, int n, int[][] coordinates) {

        boolean [][] memo = new boolean[m][n];

        long [] result = new long[5];

        for (int l = 0; l < coordinates.length; l++) {
            int x1 = coordinates[l][0];
            int y1 = coordinates[l][1];
            memo[x1][y1] = true;
        }

        for (int l = 0; l < coordinates.length; l++) {
            int x1 = coordinates[l][0];
            int y1 = coordinates[l][1];

            boolean isLeft = (y1-1) > -1;
            boolean isUpper = (x1-1) > -1;
            boolean isRight = (y1+1) < n;
            boolean isLower = (x1+1) < m;

            //Upper Left
            if (isLeft && isUpper) {
                result[countDark(x1-1, y1-1, x1, y1, memo)]++;
            }

            //Lower Left
            if (isLeft && isLower) {
                result[countDark(x1, y1-1, x1+1, y1, memo)]++;
            }

            //Upper Right
            if (isRight && isUpper) {
                result[countDark(x1-1, y1, x1, y1+1, memo)]++;
            }

            //Lower Right
            if (isRight && isLower) {
                result[countDark(x1, y1, x1+1, y1+1, memo)]++;
            }
        }

        return result;
    }

    private static int countDark(int x1, int y1, int x2, int y2, boolean [][] memo) {

        int count = 0;

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if(memo[i][j] == true) {
                    count++;
                }
            }
        }

        return count;
    }
}

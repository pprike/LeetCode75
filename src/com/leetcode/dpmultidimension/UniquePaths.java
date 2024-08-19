package com.leetcode.dpmultidimension;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {

        int [] [] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp [i][j] = 1;
                    continue;
                }
                if (j == 0) {
                    dp [i][j] = dp[i-1][j];
                    continue;
                }

                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp [m-1][n-1];
    }
}
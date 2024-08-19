package com.leetcode.dpmultidimension;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "bsbininm";
        String text2 = "jmjkbkjkv";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        char[] strArr1 = text1.toCharArray();
        char[] strArr2 = text2.toCharArray();

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (strArr1[i-1] == strArr2[j-1]) {
                    dp[i][j] = dp[i - 1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[text1.length()] [text2.length()];

    }
}
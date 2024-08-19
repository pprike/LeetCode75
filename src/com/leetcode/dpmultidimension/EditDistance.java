package com.leetcode.dpmultidimension;

public class EditDistance {

    public static void main(String[] args) {
        String text1 = "horse";
        String text2 = "ros";
        System.out.println(minDistance(text1, text2));
    }

    public static int minDistance(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        char[] strArr1 = text1.toCharArray();
        char[] strArr2 = text2.toCharArray();

        for (int k = 0; k <= text1.length(); k++) {
            dp [k][0] = k;
        }

        for (int l = 0; l <= text2.length(); l++) {
            dp [0][l] = l;
        }

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (strArr1[i-1] == strArr2[j-1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }

        return dp[text1.length()] [text2.length()];

    }
}
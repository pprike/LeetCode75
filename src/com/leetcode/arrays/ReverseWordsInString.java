package com.leetcode.arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] allStrings = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = allStrings.length-1; i>-1; i--) {

            String token = allStrings[i].trim();

            if (!token.isEmpty()) {
                res.append(token).append(" ");
            }
        }

        return res.toString().trim();
    }
}

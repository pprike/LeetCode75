package com.leetcode.stack;

import java.util.Stack;

public class DecodeStrings {

    public static void main(String[] args) {
        String encodedString = "100[abc]3[cd]ef";
        System.out.println(decodeString(encodedString));
    }

    public static String decodeString(String s) {

        StringBuilder result = new StringBuilder();

        final char[] allChars = s.toCharArray();

        Stack<Integer> counter = new Stack<>();
        Stack<String> strCache = new Stack<>();

        StringBuilder tempString = new StringBuilder();

        String number = "";

        for (char c: allChars) {
            if (Character.isDigit(c)) {
                number = number.concat(Character.toString(c));
            } else if (c == '[') {
                counter.push(Integer.valueOf(number));
                number = "";
//                if (tempString.length() > 0) {
                    strCache.push(tempString.toString());
                    tempString.setLength(0);
//                }
            } else if (c == ']') {
                int count = counter.pop();

                String pattern = tempString.toString();
                for (int i = 1; i < count; i++) {
                    tempString.append(pattern);
                }

                if (!strCache.isEmpty()) {
                    tempString.insert(0, strCache.pop());
                } else {
                    result.append(tempString);
                    tempString.setLength(0);
                }
            } else {
                tempString.append(c);
            }
        }

        return result.append(tempString).toString();
    }
}

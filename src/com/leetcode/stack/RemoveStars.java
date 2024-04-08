package com.leetcode.stack;

import java.util.Stack;

public class RemoveStars {

    public static void main(String[] args) {
        String s = "*leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        final char[] chars = s.toCharArray();

        for (char c : chars) {

            if (c != '*') {
                stack.push(c);
                continue;
            }

            if(!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString();
    }
}
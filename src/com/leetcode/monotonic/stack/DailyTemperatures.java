package com.leetcode.monotonic.stack;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(dailyTemperatures(temperatures));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // Declare Stack and result array
        Stack<Integer> decreasingStack = new Stack<Integer>();
        int i = 0;
        int[] result = new int[temperatures.length];

        while (i < temperatures.length) {
            while (!decreasingStack.isEmpty() && temperatures[decreasingStack.peek()] < temperatures[i]) {
                int poppedIdx = decreasingStack.pop();
                result[poppedIdx] = i - poppedIdx;
            }
            decreasingStack.push(i);
            i++;
        }

        // Not required since the value would be 0 by default in array.
        while (!decreasingStack.isEmpty()) {
            int poppedIdx = decreasingStack.pop();
            result[poppedIdx] = 0;
        }

        return result;

    }
}
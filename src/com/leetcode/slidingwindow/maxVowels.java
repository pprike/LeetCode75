package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxVowels {

    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s, int k) {
        int startIdx = 0;

        int vowelCount = 0;
        int maxVowelCount = 0;
        char [] chars = s.toCharArray();


        for (int i=0; i<k; i++) {
            if(isVowel(chars[i])) {
                vowelCount++;
            }
        }

        maxVowelCount = vowelCount;

        for (int j = k; j < chars.length; j++) {
            if (isVowel(chars[j])) {
                vowelCount++;
            }

            if (isVowel(chars[startIdx])) {
                vowelCount--;
            }

            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
            }
            startIdx++;
        }

        return maxVowelCount;
    }
}

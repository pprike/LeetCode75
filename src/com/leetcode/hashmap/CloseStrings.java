package com.leetcode.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class CloseStrings {

    public static void main(String[] args) {

        String a = "abc";
        String b = "bca";
        System.out.println(closeStrings(a, b));
    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        final char[] word1Chars = word1.toCharArray();
        final char[] word2Chars = word2.toCharArray();

        int [] freqArr1 = new int[26];
        int [] freqArr2 = new int[26];

        Set<Character> allChars1 = new HashSet<>();
        Set<Character> allChars2 = new HashSet<>();

        populateArrays(word1Chars, freqArr1, allChars1);
        populateArrays(word2Chars, freqArr2, allChars2);

        Arrays.sort(freqArr1);
        Arrays.sort(freqArr2);



        if (Arrays.equals(freqArr1, freqArr2) && allChars1.equals(allChars2)) {
            return true;
        }

        return false;
    }

    private static void populateArrays(char[] wordChars, int[] freqArr, Set<Character> allChars) {
        for (int i = 0; i < wordChars.length; i++) {
            char c = wordChars[i];
            int val = Integer.valueOf(c) - 97;
            freqArr[val] = freqArr[val] + 1;
            allChars.add(c);
        }
    }
}

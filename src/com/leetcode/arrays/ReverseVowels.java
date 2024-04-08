package com.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ReverseVowels {

    public static void main(String[] args) {

        System.out.println(reverseVowels("aA"));
    }

    public static String reverseVowels(String s) {

        char []  strChar = s.toCharArray();
        List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "o", "u"});

        int left = 0;
        int right = strChar.length - 1;

        while (left < right) {

            while (!vowels.contains(String.valueOf(strChar[left]).toLowerCase()) && left < right) {
                left++;
            }

            while (!vowels.contains(String.valueOf(strChar[right]).toLowerCase()) && right > left) {
                right--;
            }

            if (vowels.contains(String.valueOf(strChar[left]).toLowerCase()) &&
                    vowels.contains(String.valueOf(strChar[right]).toLowerCase())) {
                char temp = strChar[left];
                strChar[left] = strChar[right];
                strChar[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(strChar);
    }
}

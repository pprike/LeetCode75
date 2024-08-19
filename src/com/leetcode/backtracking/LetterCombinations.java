package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    static List<String> result = new ArrayList<>();
    static Map<Character, String> digitToLetters;

    public static void main(String[] args) {
        digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        String digits = "2";
        letterCombinations(digits);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }

       createCombinations(0, digits, new StringBuffer());
       return result;
    }

    public static void createCombinations(int length, String digits, StringBuffer temp) {

        if (length == digits.length()) {
            result.add(temp.toString());
            return;
        }

        final char c = digits.charAt(length);
        String letters = digitToLetters.get(c);

        for (char alphabet: letters.toCharArray()) {
            temp.append(alphabet);
            createCombinations(length+1, digits, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
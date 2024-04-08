package com.leetcode.arrays;

import java.util.HashMap;

public class CanPlaceflowers {

    public static void main(String[] args) {

        int [] sample = { 1, 0, 0, 0,1};
        System.out.println(canPlaceFlowers(sample, 9));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i=0; i<flowerbed.length; i++) {

            if (n == 0) {
                return true;
            }

            if (flowerbed[i] == 1) {
                i = i+1;
                continue;
            }

            int right = flowerbed[i+1];
            if (i < flowerbed.length-1 || right == 0) {
                n--;
                flowerbed[i] = 1;
                i = i+1;
            } else {
                i = i+2;
            }
        }

        return false;
    }
}

package com.leetcode.arrays;

public class HighestAltitude {

    public static void main(String[] args) {

        int [] sample = {-4,-3,-2,-1,4,3,2};
        highAsf(sample);
    }

    public static void highAsf(int[] alt) {
        int maxAlt = 0;
        int totalAlt = 0;

        for (int i=0; i < alt.length; i++) {
            totalAlt += alt[i];

            if (totalAlt < 0) {
                continue;
            }

            if (totalAlt > maxAlt) {
                maxAlt = totalAlt;
            }
            System.out.println(totalAlt);
        }
        System.out.println(maxAlt);
    }
}

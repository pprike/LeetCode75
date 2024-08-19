package com.leetcode.sorting;

public class InsertionSort {

    public static void main(String[] args) {

//      int[] sample = {8, 6, 7, 5, 2, 1, 4, 3};
        int[] sample = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        insertionSort(sample);
    }

    public static int[] insertionSort(int[] input) {

        // 1. Select the elements one by one to find position in sorted array.
        for (int i=1; i<input.length; i++) {

            int val = input[i];

            // 2. if the selected element is lower, find position in the previous array. otherwise move forward.
            if (val > input[i-1]) {
                System.out.println("Pass: " + (i+1));
                for (int r : input) {
                    System.out.println(r);
                }
                continue;
            }

            //3. if position is found shift the array.
            int j = i-1;
            while(j >= 0 && val <= input[j]) {
                input[j+1] = input[j];
                j--;
            }

            input[j+1] = val;


            System.out.println("Pass: " + (i+1));
            for (int r : input) {
                System.out.println(r);
            }
        }

        return input;
    }
}
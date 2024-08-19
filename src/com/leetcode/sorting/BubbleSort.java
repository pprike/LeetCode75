package com.leetcode.sorting;

public class BubbleSort {

    public static void main(String[] args) {

//      int[] sample = {8, 6, 7, 5, 2, 1, 4, 3};
        int[] sample = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        bubbleSort(sample);
    }

    public static int[] bubbleSort(int[] input) {

        for (int i=0; i<input.length; i++) {
            for (int j=0; j<input.length-i-1; j++) {

                if (input[j] >  input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            System.out.println("Pass: " + (i+1));
            for (int r : input) {
                System.out.println(r);
            }
        }

        return input;
    }
}
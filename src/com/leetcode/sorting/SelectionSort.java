package com.leetcode.sorting;

public class SelectionSort {

    public static void main(String[] args) {

//      int[] sample = {8, 6, 7, 5, 2, 1, 4, 3};
        int[] sample = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        selectionSort(sample);
    }

    public static int[] selectionSort(int[] input) {

        for (int i=0; i<input.length; i++) {
            int selectedIdx = i;
            for (int j=i+1; j<input.length; j++) {
                if (input[selectedIdx] >  input[j]) {
                   selectedIdx = j;
                }
            }

            int selectedElement = input[selectedIdx];
            input[selectedIdx] = input[i];
            input[i] = selectedElement;

            System.out.println("Pass: " + (i+1));
            for (int r : input) {
                System.out.println(r);
            }
        }

        return input;
    }
}
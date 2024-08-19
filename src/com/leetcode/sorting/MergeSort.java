package com.leetcode.sorting;

public class MergeSort {

    public static void main(String[] args) {

//      int[] sample = {8, 6, 7, 5, 2, 1, 4, 3};
        int[] sample = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        final int[] res = mergeSort(sample);

        for (int r : res) {
            System.out.println(r);
        }
    }

    public static int[] mergeSort(int[] input) {

       if (input.length == 1) {
           return input;
       }

       int pivot = input.length/2;
       int left [] = new int[input.length/2];
       int right [] = new int[input.length - input.length/2];

       for (int i=0; i<input.length; i++)
       {
           if (pivot > i) {
               left[i] = input[i];
           } else {
               right[i-pivot] = input[i];
           }
       }

       return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {

        int res[] = new int[left.length + right.length];

        int leftPtr = 0;
        int rightPtr = 0;
        int counter = 0;

        while (leftPtr < left.length && rightPtr < right.length) {
            if (left[leftPtr] < right[rightPtr]) {
                res[counter] = left[leftPtr];
                leftPtr++;
            } else {
                res[counter] = right[rightPtr];
                rightPtr++;
            }
            counter++;
        }

        while(rightPtr < right.length) {
            res[counter] = right[rightPtr];
            rightPtr++;
            counter++;
        }

        while(leftPtr < left.length) {
            res[counter] = left[leftPtr];
            leftPtr++;
            counter++;
        }

        return res;

       /* if ( left[left.length-1] <= right[0] ) {
        } else if ( right[right.length-1] <= left[0] ) {
            for
        } else {

            for (int i = 0; i < left.length+ right.length; i++) {

            }

        }

        for (int r : left) {
            System.out.println("left:" +  r);
        }

        for (int r : right) {
            System.out.println("right:" + r);
        }


        return left; */
    }
}
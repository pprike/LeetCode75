package com.leetcode.arrays;

public class Fibonnaci {

    public static void main(String[] args) {
        int n = 100;
        long arr[] = new long[n+1];

        generateFibbonacci(n, arr);

        for (int i = 1; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static long generateFibbonacci(int n, long arr[]) {

        if (arr[n] != 0 ) {
            return arr[n];
        }

        if (n == 1 || n == 2) {
            arr[n] = 1;
            return arr[n];
        }

        long res = generateFibbonacci(n-1, arr) + generateFibbonacci(n-2, arr);
        arr[n] = res;
        return res;
    }
}
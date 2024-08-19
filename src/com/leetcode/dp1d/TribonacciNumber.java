package com.leetcode.dp1d;

public class TribonacciNumber {

    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 1;

    public static void main(String[] args) {
        System.out.println(tribonacci(3));
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {

        int n4 = 0;

        if (n == 1 || n == 2) {
            return 1;
        }

        while(n-2 > 0) {
            n4 = n3 + n2 + n1;
            n1 = n2;
            n2 = n3;
            n3 = n4;
            n--;
        }
        return n4;
    }
}
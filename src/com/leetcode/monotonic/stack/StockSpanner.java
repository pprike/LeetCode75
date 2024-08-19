package com.leetcode.monotonic.stack;

import java.util.ArrayList;
import java.util.Stack;


public class StockSpanner {

    public static class tester {


        public static void main(String[] args) {
            StockSpanner s = new StockSpanner();
        }
    }

    Stack<Integer> decreasingStack;
    ArrayList<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();
        decreasingStack = new Stack<>();

        System.out.println(this.next(100)); // return 1
        System.out.println(this.next(80));  // return 1
        System.out.println(this.next(60));  // return 1
        System.out.println(this.next(70));  // return 2
        System.out.println(this.next(60));  // return 1
        System.out.println(this.next(75));  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        System.out.println(this.next(85));  // return 6
    }

    public int next(int price) {

        list.add(price);

        // Maintain decreasing monotonic stack
        // if value is greater than peek remove till bigger peek is found

        while (!decreasingStack.isEmpty() && list.get(decreasingStack.peek()) < price) {
            decreasingStack.pop();
        }

        if (decreasingStack.isEmpty()) {
            decreasingStack.push(list.size() - 1);
            return list.size();
        } else {
            int res = list.size() - 1 - decreasingStack.peek();
            decreasingStack.push(list.size() - 1);
            return res;
        }
    }
}
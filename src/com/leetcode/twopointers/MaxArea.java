package com.leetcode.twopointers;

public class MaxArea {

    public static void main(String[] args) {

        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
       int p1 = 0;
       int p2 = height.length-1;

       int maxArea = Integer.MIN_VALUE;

       while(p2 > p1) {
           int length = Math.min(height[p1], height[p2]);
           int width = p2-p1;
           int area = length * width;

           maxArea = area > maxArea ? area : maxArea;

           if (height[p1] >  height[p2]) {
               p2--;

           } else if (height[p1] < height[p2]) {
               p1++;
           } else {
               //p1==p2
               if (height[p1+1] > height[p2-1]) {
                   p1++;
               } else {
                   p2--;
               }
           }
       }

       return maxArea;

    }
}
package com.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
    }

    public static void main(String[] args) {

        ListNode head =
                new ListNode(5,
                        new ListNode(4,
                                new ListNode(2,
                                        new ListNode(1))));

        System.out.println(pairSum(head));
    }

    public static int pairSum(ListNode head) {

        ListNode leftPtr = head;
        ListNode rightPtr = head.next;

        List<Integer> tempList = new ArrayList<>();
        tempList.add(head.val);

        while(rightPtr.next != null && rightPtr.next.next != null) {
            leftPtr = leftPtr.next;
            rightPtr = rightPtr.next.next;
            tempList.add(leftPtr.val);
        }

        leftPtr = leftPtr.next;

        int maxSum = 0;
        for (int i = tempList.size()-1; i >= 0 ; i--) {

            int newVal = leftPtr.val + tempList.get(i);
            maxSum = maxSum < newVal ? newVal : maxSum;
            leftPtr = leftPtr.next;
        }
        return maxSum;
    }
}
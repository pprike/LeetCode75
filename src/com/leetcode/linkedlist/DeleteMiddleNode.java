//package com.leetcode.linkedlist;
//
//public class DeleteMiddleNode {
//
//     public static class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//    }
//
//    public static void main(String[] args) {
//        int [] nums = {-1,-1,-1,-1,0,1};
//        System.out.println(pivotIndex(nums));
//    }
//
//    public static ListNode deleteMiddle(ListNode head) {
//
//         if (head.next == null) {
//             return null;
//         }
//
//        ListNode fastPtr = head.next;
//        ListNode slowPtr = head;
//
//        while(fastPtr.next != null && fastPtr.next.next !=null) {
//            slowPtr = slowPtr.next;
//            fastPtr = fastPtr.next.next;
//        }
//
//        if (slowPtr.next.next != null) {
//            slowPtr.next = slowPtr.next.next;
//        } else {
//            slowPtr.next = null;
//        }
//
//
//        return head;
//
//
//    }
//}
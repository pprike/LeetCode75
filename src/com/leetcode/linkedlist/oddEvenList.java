package com.leetcode.linkedlist;

public class oddEvenList {

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

        ListNode head = new ListNode(0);

        ListNode prev = head;
         int n = 1;
         while (n < 8) {
             ListNode node = new ListNode(n);
             prev.next = node;
             n++;
             prev = node;
         }

         oddEvenList(head);

    }

    public static ListNode oddEvenList(ListNode head) {

         if (head.next == null) {
             return null;
         }

        ListNode oddListPtr = head;
        ListNode evenListPtr = head.next;
        ListNode evenList = head.next;

        while(evenListPtr != null && evenListPtr.next != null) {
            oddListPtr.next = evenListPtr.next;
            oddListPtr = oddListPtr.next;
            evenListPtr.next = oddListPtr.next;
            evenListPtr = evenListPtr.next;
        }

        oddListPtr.next = evenList;
        return head;
    }
}
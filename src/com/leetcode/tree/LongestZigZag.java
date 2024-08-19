package com.leetcode.tree;

public class LongestZigZag {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int maxLength = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(-2, null, null)), new TreeNode(2, null, new TreeNode(1, null, null))),
                new TreeNode(-3, null, new TreeNode(11, null, null)));
        System.out.println(longestZigZag(root));
    }

    public static void zigZagCounter(TreeNode root, int length, boolean direction) {

        if (root == null) {
            return;
        }

        maxLength = Math.max(maxLength, length);

        if (direction) {
            zigZagCounter(root.left, length+1, false);
            zigZagCounter(root.right, 1, true);
        } else {
            zigZagCounter(root.left, 1, false);
            zigZagCounter(root.right, length+1, true);
        }
    }

    public static int longestZigZag(TreeNode root) {

        zigZagCounter(root, 0, true);
        return maxLength;
    }
}

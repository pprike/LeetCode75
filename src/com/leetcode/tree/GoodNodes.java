package com.leetcode.tree;

public class GoodNodes {

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

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3, new TreeNode(6, new TreeNode(3, null, null), null),
                new TreeNode(4, new TreeNode(1, null, null), new TreeNode(5, null, null)));

        System.out.println(isGood(root, root.val));
    }

    public static int isGood(TreeNode root, int maxVal) {
        int goodNodes = 0;

        if (root.val >= maxVal) {
            goodNodes++;
            maxVal = root.val;
        }

        System.out.println(root.val + " | Max: " + maxVal);

        if (root.left != null) {
            goodNodes += isGood(root.left, maxVal);
        }

        if (root.right != null) {
            goodNodes +=  isGood(root.right, maxVal);
        }

        return goodNodes;
    }
}
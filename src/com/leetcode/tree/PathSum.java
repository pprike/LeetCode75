package com.leetcode.tree;

public class PathSum {

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
        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(-2, null, null)), new TreeNode(2, null, new TreeNode(1, null, null))),
                new TreeNode(-3, null, new TreeNode(11, null, null)));

        System.out.println(pathSum(root, 8));
    }

    public static int helper(TreeNode root, int targetSum, int curSum) {

        int count = 0;

        if (root == null) {
            return 0;
        }

        curSum = root.val + curSum;

        if (curSum == targetSum) {
            count++;
        }

        count += helper(root.left, targetSum, curSum);
        count += helper(root.right, targetSum, curSum);

        return count;
    }


    public static int pathSum(TreeNode root, int targetSum) {

        int count = 0;

        if (root == null) {
            return 0;
        }

        count += helper(root, targetSum, 0);
        count += pathSum(root.left, targetSum) + pathSum(root.right, targetSum);

        return count;
    }
}
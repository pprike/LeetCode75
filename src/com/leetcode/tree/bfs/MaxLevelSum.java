package com.leetcode.tree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSum {

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

    public static Queue<TreeNode> queue = new LinkedList<>();


    public static void main(String[] args) {

        TreeNode root = new TreeNode(3, new TreeNode(6, new TreeNode(3, null, null), null),
                new TreeNode(4, new TreeNode(1, null, null), new TreeNode(5, null, null)));

        System.out.println(maxLevelSum(root));
    }

    public static int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxValue = root.val;
        int level = 2;
        int maxLevel = 1;
        int currSum = 0;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);


        while (!queue.isEmpty()) {

            TreeNode next = queue.poll();

            if (next.left != null) {
                currSum += next.left.val;
                queue.add(next.left);
            }

            if (next.right != null) {
                currSum += next.right.val;
                queue.add(next.right);
            }

            if (queue.peek() == null) {

                if (currSum > maxValue) {
                    maxLevel = level;
                    maxValue = currSum;
                }

                currSum = 0;
                level++;
                queue.poll();

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }

        return maxLevel;
    }
}
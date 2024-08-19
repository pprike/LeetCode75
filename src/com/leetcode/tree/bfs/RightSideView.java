package com.leetcode.tree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;

public class RightSideView {

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

        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(new TreeNode(Integer.MAX_VALUE, null, null));

        while (!queue.isEmpty()) {

            TreeNode next = queue.poll();

            if (next.left != null) {
                queue.add(next.left);
            }

            if (next.right != null) {
                queue.add(next.right);
            }

            if (queue.peek().val == Integer.MAX_VALUE) {
                queue.poll();
                result.add(next.val);
                if (!queue.isEmpty()) {
                    queue.add(new TreeNode(Integer.MAX_VALUE, null, null));
                }
            }
        }

        return result;
    }
}
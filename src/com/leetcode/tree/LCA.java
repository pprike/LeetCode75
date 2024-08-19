package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class LCA {

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

        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null), new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));

        System.out.println(lowestCommonAncestor(root, new TreeNode(5, null, null), new TreeNode(1, null, null)));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pTree = new ArrayList<>();
        List<TreeNode> qTree = new ArrayList<>();
        getPathArray(root, p, pTree);
        getPathArray(root, q, qTree);


        pTree.forEach((node) -> System.out.println(node.val));
        System.out.println("------------------------------------");
        qTree.forEach((node) -> System.out.println(node.val));

        return null;
    }

    public static TreeNode getPathArray(TreeNode root, TreeNode searchNode, List<TreeNode> path) {

        if (root == null) {
            return null;
        }

        if (root.val == searchNode.val) {
            return searchNode;
        }

        final TreeNode pathArrayLeft = getPathArray(root.left, searchNode, path);
        path.add(pathArrayLeft);
        if (pathArrayLeft != null && pathArrayLeft.val == searchNode.val) {
            return pathArrayLeft;
        }

        final TreeNode pathArrayRight = getPathArray(root.right, searchNode, path);
        path.add(pathArrayRight);
        if (pathArrayRight != null && pathArrayRight.val == searchNode.val) {
            return pathArrayRight;
        }

        return null;
    }


}
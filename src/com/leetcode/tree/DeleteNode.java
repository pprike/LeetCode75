/*
package com.leetcode.tree;

public class DeleteNode {

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
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                new TreeNode(6, null, new TreeNode(7, null, null)));
        System.out.println(deleteNode(root, 3));
    }

    public static TreeNode deleteNode(TreeNode root, int key) {

        TreeNode parent = findNode(root, root, key);
        deleteNodeAt(parent, key);
        return root;
    }

    public static TreeNode findNode(TreeNode parent, TreeNode root, int key) {

        if (root == null)
            return null;

        if (root.val == key) {
            return parent;
        } else if (root.val > key) {
            findNode(root, root.left, key);
        } else {
            findNode(root, root.right, key);
        }

        return null;
    }

    public static void deleteNodeAt(TreeNode parent, int key) {

        if (parent == null) {
            return;
        }

        TreeNode delNode;

        if (parent.left != null && parent.left.val == key) {
            delNode = parent.left;
            parent.left = delNode.left;
        } else {
            delNode = parent.right;
            parent.right = delNode.righte;
        }

         else


    }
}*/

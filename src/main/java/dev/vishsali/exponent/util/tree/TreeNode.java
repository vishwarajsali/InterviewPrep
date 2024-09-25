package dev.vishsali.exponent.util.tree;

public class TreeNode {
    public String value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode(String value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
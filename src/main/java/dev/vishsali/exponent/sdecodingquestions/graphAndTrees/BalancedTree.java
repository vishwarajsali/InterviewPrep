package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import dev.vishsali.exponent.util.tree.TreeNode;

public class BalancedTree {

    public boolean isBalanced(TreeNode node) {
        // your code goes here
        if (node == null) return true;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        int heightDiff = Math.abs(leftHeight - rightHeight);

        if (heightDiff > 1) return false;

        return isBalanced(node.left) && isBalanced(node.right);
    }


    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

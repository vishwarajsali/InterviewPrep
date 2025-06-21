package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import dev.vishsali.exponent.util.tree.Node;

public class DiameterofaTree {

    public int diameterOfTree(Node root) {
        // your code goes here
        if(root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int height = leftHeight + rightHeight;


        return height;
    }

    private int getHeight(Node node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

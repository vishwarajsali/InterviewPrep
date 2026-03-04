package dev.vishsali.neetcode.courses.dsaForBeginner.trees.BSTInsertandRemove;

import dev.vishsali.util.list.tree.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertintoaBinarySearchTreeTest {

    private final InsertintoaBinarySearchTree solution = new InsertintoaBinarySearchTree();

    @Test
    void testInsertIntoEmptyTree() {
        TreeNode result = solution.insertIntoBST(null, 5);
        assertNotNull(result);
        assertEquals(5, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void testInsertLeft() {
        TreeNode root = new TreeNode(5);
        TreeNode result = solution.insertIntoBST(root, 3);
        assertEquals(5, result.val);
        assertNotNull(result.left);
        assertEquals(3, result.left.val);
        assertNull(result.right);
    }

    @Test
    void testInsertRight() {
        TreeNode root = new TreeNode(5);
        TreeNode result = solution.insertIntoBST(root, 7);
        assertEquals(5, result.val);
        assertNull(result.left);
        assertNotNull(result.right);
        assertEquals(7, result.right.val);
    }

    @Test
    void testInsertMultiple() {
        TreeNode root = null;
        root = solution.insertIntoBST(root, 5);
        root = solution.insertIntoBST(root, 3);
        root = solution.insertIntoBST(root, 7);
        root = solution.insertIntoBST(root, 2);
        root = solution.insertIntoBST(root, 4);

        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(7, root.right.val);
        assertEquals(2, root.left.left.val);
        assertEquals(4, root.left.right.val);
    }

    @Test
    void testInsertEqual() {
        TreeNode root = new TreeNode(5);
        TreeNode result = solution.insertIntoBST(root, 5);
        assertEquals(5, result.val);
        assertNull(result.left);
        assertNotNull(result.right);
        assertEquals(5, result.right.val);
    }
}

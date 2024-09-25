package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import dev.vishsali.exponent.util.tree.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BalancedTreeTest {
    @InjectMocks
    private BalancedTree test;

    @Test
    void test1() {
        assertTrue(test.isBalanced(new TreeNode("a", new TreeNode("b", new TreeNode("d"), new TreeNode("e")), new TreeNode("c", null, new TreeNode("f")))));

    }
}
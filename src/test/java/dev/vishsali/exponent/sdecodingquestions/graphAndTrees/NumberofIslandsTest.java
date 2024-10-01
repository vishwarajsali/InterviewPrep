package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NumberofIslandsTest {
    @InjectMocks
    private NumberofIslands test;

    @Test
    void test1() {
        assertEquals(5, test.getNumberOfIslands(new int [][] {
                {1, 0, 1, 0, 1},
                {0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 1, 1, 0}
        }));
    }
}
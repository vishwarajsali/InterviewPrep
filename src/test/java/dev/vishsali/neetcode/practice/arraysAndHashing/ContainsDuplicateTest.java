package dev.vishsali.neetcode.practice.arraysAndHashing;

import dev.vishsali.neetcode.practice.blind75.arraysAndHashing.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ContainsDuplicateTest {


    @InjectMocks
    private ContainsDuplicate test;

    @Test
    void test1(){
        assertTrue(test.hasDuplicate(new int[]{1, 2, 3, 3}));
        assertFalse(test.hasDuplicate(new int[]{1, 2, 3, 4}));
        assertFalse(test.hasDuplicate(new int[]{0}));
        assertFalse(test.hasDuplicate(new int[]{}));

    }

}
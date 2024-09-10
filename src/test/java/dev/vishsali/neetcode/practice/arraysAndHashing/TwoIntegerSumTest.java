package dev.vishsali.neetcode.practice.arraysAndHashing;

import dev.vishsali.neetcode.practice.blind75.arraysAndHashing.TwoIntegerSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class TwoIntegerSumTest {
    @InjectMocks
    private TwoIntegerSum test;

    @Test
    void test1(){
        assertArrayEquals(test.twoSum(new int[] {2, 7, 11, 15}, 7), new int[]{0,1});
//        assertArrayEquals(test.twoSum(new int[] {1, 0}, Integer.MAX_VALUE), new int[]{-1,-1});
//        assertArrayEquals(test.twoSum(new int[] {Integer.MAX_VALUE, 1}, 1), new int[]{-1,-1});
    }
}
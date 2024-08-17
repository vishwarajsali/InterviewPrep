package dev.vishsali.exponent.sdecodingquestions.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class MergeIntervalsTest {
    @InjectMocks
    private MergeIntervals test;

    @Test
    void test1(){
        assertArrayEquals(new int[][]{{1,6}, {8,10}, {15,18}},
                test.mergeIntervals(new int[][]{{1,3}, {2,6}, {8,10}, {15,18}}));
//        assertArrayEquals(test.twoSum(new int[] {1, 0}, Integer.MAX_VALUE), new int[]{-1,-1});
//        assertArrayEquals(test.twoSum(new int[] {Integer.MAX_VALUE, 1}, 1), new int[]{-1,-1});
    }

}
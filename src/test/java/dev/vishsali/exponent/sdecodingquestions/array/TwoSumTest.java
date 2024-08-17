package dev.vishsali.exponent.sdecodingquestions.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TwoSumTest {
    @InjectMocks
    private TwoSum test;

    @Test
    void test1(){
        assertArrayEquals(new int[]{0,1}, test.twoSum(new int[] {2, 7, 11, 15}, 9));
//        assertArrayEquals(test.twoSum(new int[] {1, 0}, Integer.MAX_VALUE), new int[]{-1,-1});
//        assertArrayEquals(test.twoSum(new int[] {Integer.MAX_VALUE, 1}, 1), new int[]{-1,-1});
    }
}
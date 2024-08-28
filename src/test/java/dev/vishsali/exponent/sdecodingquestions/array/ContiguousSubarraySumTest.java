package dev.vishsali.exponent.sdecodingquestions.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ContiguousSubarraySumTest {
    @InjectMocks
    private ContiguousSubarraySum test;

    @Test
    void test1(){
//        assertTrue(test.hasGoodSubarray(new int[]{23, 2, 4, 7}, 6));
        assertFalse(test.hasGoodSubarray(new int[]{5, 0, 0, 0}, 3));
        assertFalse(test.hasGoodSubarray(new int[]{}, 1));
    }

}
package dev.vishsali.exponent.sdecodingquestions.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class MaximumSubarraySumTest {
    @InjectMocks
    private MaximumSubarraySum test;

    @Test
    void test1() {
        assertEquals(7,
                test.maxSubarraySum(new int[]{2, 3, -2, 4}));
        assertEquals(1,
                test.maxSubarraySum(new int[]{1, -1, -5, -4}));
    }

}

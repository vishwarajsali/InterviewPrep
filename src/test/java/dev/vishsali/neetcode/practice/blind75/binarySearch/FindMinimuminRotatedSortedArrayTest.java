package dev.vishsali.neetcode.practice.blind75.binarySearch;

import dev.vishsali.exponent.sdecodingquestions.array.ContiguousSubarraySum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class FindMinimuminRotatedSortedArrayTest {
    @InjectMocks
    private FindMinimuminRotatedSortedArray test;

    @Test
    void test1(){
//        assertTrue(test.hasGoodSubarray(new int[]{23, 2, 4, 7}, 6));
        assertEquals(1,test.findMin(new int[]{3,4,5,6,1,2}));
    }

}
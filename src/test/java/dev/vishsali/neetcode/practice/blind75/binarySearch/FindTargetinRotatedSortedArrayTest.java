package dev.vishsali.neetcode.practice.blind75.binarySearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class FindTargetinRotatedSortedArrayTest {
    @InjectMocks
    private FindTargetinRotatedSortedArray test;

    @Test
    void test1(){
//        assertTrue(test.hasGoodSubarray(new int[]{23, 2, 4, 7}, 6));
        assertEquals(4,test.search(new int[]{3,4,5,6,1,2}, 1));
        assertEquals(0,test.search(new int[]{1}, 1));
    }

}
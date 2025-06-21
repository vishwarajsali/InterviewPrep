package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import dev.vishsali.neetcode.practice.blind75.binarySearch.FindMinimuminRotatedSortedArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LongestConsecutiveSequenceTest {
    @InjectMocks
    private LongestConsecutiveSequence test;

    @Test
    void test1(){
//        assertTrue(test.hasGoodSubarray(new int[]{23, 2, 4, 7}, 6));
        assertEquals(4,test.longestConsecutive(new int[]{2,20,4,10,3,4,5}) );
    }

}
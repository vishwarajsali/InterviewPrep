package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import dev.vishsali.exponent.sdecodingquestions.array.ContiguousSubarraySum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class NumberFinderTest {
    @InjectMocks
    private NumberFinder test;

    @Test
    void test1(){
//        assertEquals(4,test.findFirst(new int[]{200, 200, 200, 200, 500, 500, 500}, 500));
//        assertEquals(4,test.findFirst(new int[]{200, 200, 200, 200, 500, 500, 500}, 200));
        assertEquals(-1,test.findFirst(new int[]{200, 200, 200, 200, 500, 500, 500}, 300));
    }
}
package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RotationsinCircularlySortedArrayTest {
    @InjectMocks
    private RotationsinCircularlySortedArray test;

    @Test
    void test1() {
        assertEquals(2, test.findRotations(new int[]{4, 5, 1, 2, 3}));
        assertEquals(3, test.findRotations(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, test.findRotations(new int[]{1, 2, 3, 4, 5}));
    }
}
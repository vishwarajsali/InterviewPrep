package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MinimumWindowSubstringTest {
    @InjectMocks
    private MinimumWindowSubstring test;

    @Test
    void test1() {
        assertEquals("YXAZ",test.minWindow("OUZODYXAZV", "XYZ"));
        assertEquals("xyz",test.minWindow("xyz", "xyz"));
        assertEquals("",test.minWindow("x", "xy"));
    }
}
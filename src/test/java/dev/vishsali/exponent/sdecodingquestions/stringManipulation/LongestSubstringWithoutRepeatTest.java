package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LongestSubstringWithoutRepeatTest {
    @InjectMocks
    private LongestSubstringWithoutRepeat test;

    @Test
    void test1() {
        assertEquals(3, test.longestSubstringWithoutRepeat("abcabcbb"));
        assertEquals(1, test.longestSubstringWithoutRepeat("bbbbb"));
        assertEquals(0, test.longestSubstringWithoutRepeat(""));
        assertEquals(3, test.longestSubstringWithoutRepeat("pwwkew"));


    }
}
package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ValidPalindromeTest {
    @InjectMocks
    private ValidPalindrome test;

    @Test
    void test1() {
//        assertTrue(test.isPalindrome("H123!@321h"));
        assertFalse(test.isPalindrome("race a car"));
    }
}
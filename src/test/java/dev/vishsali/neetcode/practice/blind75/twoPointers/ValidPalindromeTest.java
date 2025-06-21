package dev.vishsali.neetcode.practice.blind75.twoPointers;

import dev.vishsali.neetcode.practice.blind75.arraysAndHashing.LongestConsecutiveSequence;
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
//        assertTrue(test.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(test.isPalindrome("No lemon, no melon"));
    }
}

package dev.vishsali.neetcode.practice.blind75.slidingWindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LongestSubstringWithoutRepeatingCharactersTest {
    @InjectMocks
    private LongestSubstringWithoutRepeatingCharacters test;

    @Test
    void testExample1() {
        assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testExample2() {
        assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testExample3() {
        assertEquals(3, test.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, test.lengthOfLongestSubstring(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, test.lengthOfLongestSubstring("a"));
    }

    @Test
    void testAllUnique() {
        assertEquals(5, test.lengthOfLongestSubstring("abcde"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(1, test.lengthOfLongestSubstring(" "));
    }

    @Test
    void testRepeatingAtEnd() {
        assertEquals(2, test.lengthOfLongestSubstring("aab"));
    }
}

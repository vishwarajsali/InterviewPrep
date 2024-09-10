package dev.vishsali.neetcode.practice.arraysAndHashing;

import dev.vishsali.neetcode.practice.blind75.arraysAndHashing.IsAnagram;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class IsAnagramTest {
    @InjectMocks
    private IsAnagram test;

    @Test
    void test1(){
        assertTrue(test.isAnagram("", ""));
        assertTrue(test.isAnagram("racecar", "carrace"));
        assertFalse(test.isAnagram("jar", "jam"));
        assertFalse(test.isAnagram("jar", "car"));
        assertFalse(test.isAnagram("car", "racecar"));
        assertFalse(test.isAnagram("xx", "x"));
    }
}
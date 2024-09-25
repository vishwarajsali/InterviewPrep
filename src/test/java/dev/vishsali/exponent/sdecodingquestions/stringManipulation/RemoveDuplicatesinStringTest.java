package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class RemoveDuplicatesinStringTest {
    @InjectMocks
    private RemoveDuplicatesinString test;

    @Test
    void test1() {
        assertEquals("abcd", test.identifyAdjacent("abcd", 2));
        assertEquals("aa", test.identifyAdjacent("deeedbbcccbdaa", 3));
        assertEquals("ps", test.identifyAdjacent("pbbcggttciiippooaais", 2));
        assertEquals("acd", test.identifyAdjacent("aaabbbacd", 3));

    }
}
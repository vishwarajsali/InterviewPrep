package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ReverseaSentenceTest {
    @InjectMocks
    private ReverseaSentence test;

    @Test
    void test1() {
        assertArrayEquals(new char[]{'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ',
                        'm', 'a', 'k', 'e', 's', ' ',
                        'p', 'e', 'r', 'f', 'e', 'c', 't'}
                , test.reverseWords(new char[]{'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                        'm', 'a', 'k', 'e', 's', ' ',
                        'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'}));
        assertArrayEquals(new char[]{' ', ' '}
                , test.reverseWords(new char[]{ ' ', ' '}));
    }
}
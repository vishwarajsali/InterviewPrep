package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import dev.vishsali.exponent.sdecodingquestions.searchingandsorting.KMessedArraySort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class MostCommonWordsTest {
    @InjectMocks
    private MostCommonWords test;

    @Test
    void test1() {
        assertArrayEquals(new String[][]{
                {"it", "2"},
                {"of", "2"},
                {"the", "2"},
                {"times", "2"},
                {"was", "2"},
                {"best", "1"},
                {"worst", "1"}
        },test.mostCommonWords("It was the best of times, it was the worst of times."));
    }
}
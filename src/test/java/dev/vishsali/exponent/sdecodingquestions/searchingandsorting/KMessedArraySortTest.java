package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class KMessedArraySortTest {
    @InjectMocks
    private KMessedArraySort test;

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},test.sortKMessedArray(new int[]{1, 4, 5, 2, 3, 7, 8, 6, 10, 9}, 2));
    }
}
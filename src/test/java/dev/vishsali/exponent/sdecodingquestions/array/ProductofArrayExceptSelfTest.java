package dev.vishsali.exponent.sdecodingquestions.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductofArrayExceptSelfTest {

    @InjectMocks
    private ProductofArrayExceptSelf test;

    @Test
    void test1(){
        assertArrayEquals(new int[]{24, 12, 8, 6},
                test.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0},
                test.productExceptSelf(new int[]{0, 0}));
        assertArrayEquals(new int[]{80, 64, 320, 40, 160},
                test.productExceptSelf(new int[]{4, 5, 1, 8, 2}));
        assertArrayEquals(new int[]{12, -24, 8, -6, 24},
                test.productExceptSelf(new int[]{-2, 1, -3, 4, -1}));
    }

}
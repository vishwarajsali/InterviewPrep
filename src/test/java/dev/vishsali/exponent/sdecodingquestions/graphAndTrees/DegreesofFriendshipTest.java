package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import dev.vishsali.exponent.sdecodingquestions.stringManipulation.LongestSubstringWithoutRepeat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DegreesofFriendshipTest {
    @InjectMocks
    private DegreesofFriendship test;

    @Test
    void test1() {
        assertEquals(1, test.friendDistance(new int [][] {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        }, 0 , 1));
        assertEquals(1, test.friendDistance(new int [][] {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        }, 1 , 2));
        assertEquals(2, test.friendDistance(new int [][] {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        }, 0 , 2));


    }
}
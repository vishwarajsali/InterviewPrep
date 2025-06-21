package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SentenceSimilarityTest {
    @InjectMocks
    private SentenceSimilarity test;

    @Test
    void test1() {
        assertTrue( test.areSentencesSimilar(
                new String[] {"i", "really", "love", "leetcode", "and", "apples"},
                new String[]{"i", "so", "like", "codesignal", "and", "oranges"},
                new String[][] {
                        {"very", "so"},
                        {"love", "adore"},
                        {"really", "very"},
                        {"leetcode", "codesignal"},
                        {"apples", "oranges"},
                        {"like", "adore"}
                }
        ));
        assertTrue( test.areSentencesSimilar(
                new String[] {"Let's", "code", "in", "Python"},
                new String[]{"Let's", "program", "in", "Python"},
                new String[][] {
                        {"code", "program"}
                }
        ));
        assertFalse( test.areSentencesSimilar(
                new String[] {"i", "enjoy", "coding", "very", "much"},
                new String[]{"i", "love", "programming", "so", "much"},
                new String[][] {
                        {"enjoy", "love"},
                        {"very", "so"}
                }
        ));

        assertTrue( test.areSentencesSimilar(
                new String[] {"I", "really", "love", "leetcode", "and", "apples"},
                new String[]{"I", "so", "like", "codesignal", "and", "oranges"},
                new String[][] {
                        {"very", "so"},
                        {"love", "adore"},
                        {"really", "very"},
                        {"leetcode", "codesignal"},
                        {"apples", "oranges"},
                        {"like", "adore"}
                }
        ));
    }
}

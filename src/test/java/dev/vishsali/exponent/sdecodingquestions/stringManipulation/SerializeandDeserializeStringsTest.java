package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class SerializeandDeserializeStringsTest {
    @InjectMocks
    private SerializeandDeserializeStrings test;

    @Test
    void test1() {
        assertEquals("\\x05hello\\x05world", test.serialize(new String[]{"hello", "world"}));
        assertEquals("\\x00", test.serialize(new String[]{""}));
        assertEquals("\\x01a\\x02bc\\x03def", test.serialize(new String[]{"a", "bc", "def"}));


        assertArrayEquals(new String[]{"hello", "world"}, test.deserialize("\\x05hello\\x05world"));
        assertArrayEquals(new String[]{""}, test.deserialize("\\x00"));
        assertArrayEquals(new String[]{"a", "bc", "def"}, test.deserialize("\\x01a\\x02bc\\x03def"));
    }
}
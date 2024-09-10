package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ValidateIPAddressTest {
    @InjectMocks
    private ValidateIPAddress test;

    @Test
    void test1() {
        assertTrue(test.validateIP("192.168.0.1"));
        assertTrue(test.validateIP("12.34.5.6"));
        assertTrue(test.validateIP("0.23.25.0"));
        assertTrue(test.validateIP("255.255.255.255"));
        assertFalse(test.validateIP("192.168.123.456"));
        assertFalse(test.validateIP("12.34.56.oops"));
        assertFalse(test.validateIP("1.2.3.4.5"));
        assertFalse(test.validateIP("1..23.4"));
        assertFalse(test.validateIP("123.235.153.425"));
    }
}
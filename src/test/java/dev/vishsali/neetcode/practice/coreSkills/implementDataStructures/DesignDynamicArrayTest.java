package dev.vishsali.neetcode.practice.coreSkills.implementDataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class DesignDynamicArrayTest {

    @InjectMocks
    private  DesignDynamicArray test;

    private int capacity;

    @Test
    void test1(){
        this.capacity = -7;
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new DesignDynamicArray(this.capacity));
        assertEquals("Capacity of the array should be > 0, But its : "+ this.capacity, exception.getMessage());
    }

}


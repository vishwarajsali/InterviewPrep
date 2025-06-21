package dev.vishsali.neetcode.practice.blind75.linkedList;

import dev.vishsali.util.list.singlyListNode.ListNode;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Log
@ExtendWith(MockitoExtension.class)
class ReorderLinkedListTest {
    @InjectMocks
    private ReorderLinkedList test;

    @Test
    void test1() {
        ListNode head = ListNode.convert_List_SinglyList(Arrays.asList(2,4,6,8));
        ListNode result = head;
        test.reorderList(result);

//        assertArrayEquals(new int[]{8,6,4,2}, ListNode.convert_SinglyList_to_array(result).toArray());



    }
}
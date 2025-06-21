package dev.vishsali.neetcode.practice.blind75.linkedList;

import dev.vishsali.neetcode.practice.blind75.stack.ValidParentheses;
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
class ReverseLinkedListTest {
    @InjectMocks
    private ReverseLinkedList test;

    @Test
    void test1() {
       ListNode head = ListNode.convert_List_SinglyList(Arrays.asList(4,6,9));
        ListNode.print_Singly_List(test.reverseList1(head));

    }
}
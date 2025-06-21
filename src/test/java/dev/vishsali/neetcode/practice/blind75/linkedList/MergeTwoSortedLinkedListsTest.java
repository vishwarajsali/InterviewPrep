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
class MergeTwoSortedLinkedListsTest {
    @InjectMocks
    private MergeTwoSortedLinkedLists test;

    @Test
    void test1() {
        ListNode list1 = ListNode.convert_List_SinglyList(Arrays.asList(1,2,4));
        ListNode list2 = ListNode.convert_List_SinglyList(Arrays.asList(1,3,5));
        ListNode.print_Singly_List(test.mergeTwoLists(list1, list2));

    }
}
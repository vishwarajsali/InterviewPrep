package dev.vishsali.neetcode.practice.blind75.linkedList;

import dev.vishsali.util.list.singlyListNode.ListNode;

public class ReorderLinkedList {

    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null, curr = slow;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode list1 = head,
                list2 = prev;

        while (list2.next != null){
            ListNode temp = list1.next;
            list1.next = list2;
            list1 = temp;

            temp = list2.next;
            list2.next = list1;
            list2 = temp;
        }

        ListNode.print_Singly_List(head);
    }
}

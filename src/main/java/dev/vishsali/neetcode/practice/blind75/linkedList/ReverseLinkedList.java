package dev.vishsali.neetcode.practice.blind75.linkedList;

import dev.vishsali.util.list.singlyListNode.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode node = reverseList(head.next);
        head.next.next= head;
        head.next = null;


        return node;
    }


    public ListNode reverseList1(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

// 1 -> 2 -> 3 -> 4
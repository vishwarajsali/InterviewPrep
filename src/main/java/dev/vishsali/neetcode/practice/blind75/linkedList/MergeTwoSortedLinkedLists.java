package dev.vishsali.neetcode.practice.blind75.linkedList;

import dev.vishsali.util.list.singlyListNode.ListNode;

public class MergeTwoSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode res = new ListNode();
        ListNode dummy = res;

        while(list1 != null && list2 != null) {
            if(list1.val <=  list2.val) {
                dummy.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                dummy.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        if(list1 != null){
            dummy.next = list1;
        }

        if(list2 != null){
            dummy.next = list2;

        }


        return res.next;

    }
}

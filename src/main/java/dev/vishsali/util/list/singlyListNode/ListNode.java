package dev.vishsali.util.list.singlyListNode;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Log
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){}


    public ListNode(int val) {this.val = val;
    next = null;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public static void print_Singly_List(ListNode head){
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        log.info("Singly Linked List to List: {}" + list);
    }

    public static ListNode convert_List_SinglyList(List<Integer> list){
        ListNode head = new ListNode();
        ListNode curr = head;
        for(Integer i : list){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return head.next;
    }

    public static List<Integer> convert_SinglyList_to_array(ListNode node){
        return null;
    }
}

package dev.vishsali.neetcode.practice.coreSkills.implementDataStructures;


import dev.vishsali.util.list.singlyListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
*
*
Design a Singly Linked List class.
Your LinkedList class should support the following operations:
LinkedList() will initialize an empty linked list.
int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.
void insertHead(int val) will insert a node with val at the head of the list.
void insertTail(int val) will insert a node with val at the tail of the list.
bool remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.
int[] getValues() return an array of all the values in the linked list, ordered from head to tail.
*
* */
public class DesignSinglyLinkedList {

    private ListNode head ;
    private int length;

    public DesignSinglyLinkedList() {
        this.length = 0;
        head = null;
    }

    public int get(int index) {
        if(index < 0 || index > length) return -1;
        ListNode dummy = head;

        while(index-- > 0) dummy = dummy.next;
        return dummy != null ? dummy.val : -1;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);

        node.next = head;
        head = node;
        length++;
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        if(isEmpty()) {
            head = node;
            length++;
            return;
        }
        ListNode dummy = head;
        while(dummy.next != null) dummy = dummy.next;
        dummy.next = node;
        length++;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= length) {
            return false;
        }
        ListNode current = head;
        ListNode previous = null;

        while(index-- > 0) {
            previous = current;
            current = current.next;
        }

        if(previous == null) head = head.next;
        else previous.next = current.next;
        length--;
        return true;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode dummy = head;

        while(dummy != null){
            list.add(dummy.val);
            dummy = dummy.next;
        }

        return list;

    }
}



class ArrayLinkedList {

    private List<Integer> list;

    public ArrayLinkedList() {
        list = new ArrayList<>();
    }

    public int get(int i) {
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return list.get(i);
    }

    public void insertHead(int val) {
        list.add(0, val); // Insert at index 0
    }

    public void insertTail(int val) {
        list.add(val); // Add at end
    }

    public boolean remove(int i) {
        if (i < 0 || i >= list.size()) {
            return false;
        }
        list.remove(i); // Remove by index
        return true;
    }


    public ArrayList<Integer> getValues() {
        return (ArrayList<Integer>) list;
    }
}

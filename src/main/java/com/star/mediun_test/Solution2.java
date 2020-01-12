package com.star.mediun_test;

public class Solution2 {

  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode next = null;
        while (head.next != null){
          next = head.next;
          head.next = prev;
          prev = head;
          head = next;
        }

        head.next = prev;
        return head;
    }
}
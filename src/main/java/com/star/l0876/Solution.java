package com.star.l0876;

import com.star.utils.ListNode;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow.next;
  }
}

package com.star.l0203;

import com.star.utils.ListNode;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode pos = new ListNode(0);
    pos.next = head;
    while (pos.next != null) {
      if (pos.next.val == val) {
        pos.next = pos.next.next;
      }else {
        pos = pos.next;
      }
    }

    return head;
  }
}

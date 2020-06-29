package com.star.l0086;

import com.star.utils.ListNode;

/**
 * @author star
 * @Date 2020/6/27.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode partition(ListNode head, int x) {
    ListNode beforeHead = new ListNode(0);
    ListNode before = beforeHead;

    ListNode afterHead = new ListNode(0);
    ListNode after = afterHead;

    while (head != null){
      if (head.val < x) {
        before.next = head;
        before = before.next;
      }else {
        after.next = head;
        after = after.next;
      }
      head = head.next;
    }

    after.next = null;
    before.next = afterHead.next;

    return beforeHead.next;
  }
}

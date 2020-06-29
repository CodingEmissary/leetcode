package com.star.l0206;

import com.star.utils.ListNode;
import com.star.utils.ListNodes;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public static ListNode reverseList(ListNode head) {
    if (head == null) return null;

    ListNode pos = new ListNode(0);
    ListNode prev = pos;
    while (head != null) {

      ListNode tmpNode = head;
      head = head.next;

      ListNode tmp = pos.next;

      pos.next = tmpNode;
      pos.next.next = tmp;
    }

    return prev.next;
  }

  public static void main(String[] args) {
    ListNodes.printList(reverseList(ListNodes.buildList(new int[]{1,2,3,4,5})));
  }
}

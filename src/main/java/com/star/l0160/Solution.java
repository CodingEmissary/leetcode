package com.star.l0160;

import com.star.utils.ListNode;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) return null;
    ListNode posA = headA, posB = headB;
    while (posA != posB) {
      posA = posA == null ? headB : posA.next;
      posB = posB == null ? headA : posB.next;
    }
    return posA;
  }
}

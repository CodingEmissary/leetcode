package com.star.l21;

/**
 * @author star
 * @Date 2020/6/10.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode lastNode = new ListNode();
    ListNode preRoot = lastNode;

    while (l1 != null && l2 != null) {
      int n1 = l1.val;
      int n2 = l2.val;

      if (n1 <= n2) {
        lastNode.next = l1;
        l1 = l1.next;
      }else {
        lastNode.next = l2;
        l2 = l2.next;
      }

      lastNode = lastNode.next;
    }

    lastNode.next = l1 == null ? l2 : l1;
    return preRoot.next;
  }
}

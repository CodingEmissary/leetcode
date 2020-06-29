package com.star.l0024;

import com.star.utils.ListNode;
import com.star.utils.ListNodes;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode swapPairs(ListNode head) {

    ListNode prev = new ListNode(0);
    prev.next = head;

    ListNode pos = prev;

    while (pos != null && pos.next != null && pos.next.next != null) {
      pos = swap(pos);
      pos = pos.next.next;
    }
    return prev.next;
  }

  public ListNode swap(ListNode prev){
    if (prev.next == null || prev.next.next == null) return prev;

    ListNode afterNode = prev.next.next.next;
    ListNode temp = prev.next;
    prev.next = prev.next.next;
    prev.next.next = temp;
    prev.next.next.next = afterNode;
    return prev;
  }

  public static void main(String[] args) {
    ListNodes.printList(new Solution().swapPairs(ListNodes.buildList(new int[]{1,2,3,4})));
  }
}

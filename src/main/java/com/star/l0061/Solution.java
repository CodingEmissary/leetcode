package com.star.l0061;

import com.star.utils.ListNode;
import com.star.utils.ListNodes;

/**
 * @author star
 * @Date 2020/6/27.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode rotateRight(ListNode head, int k) {

    //找出链表长度
    ListNode pos = head;
    int len = 0;
    while (pos != null) {
      len++;
      pos = pos.next;
    }

    if (len == 0) return head;
    int n = k % len;
    if (n == 0) return head;

    //双指针找出倒数第k个节点
    ListNode slow = head, fast = head;

    int slowPos = 0, fastPos = 0;
    while (fast != null && fast.next != null) {
      fastPos++;
      fast = fast.next;

      if (fastPos - slowPos > n) {
        slow = slow.next;
        slowPos++;
      }
    }

    fast.next = head;
    head = slow.next;
    slow.next = null;

    return head;
  }

  public static void main(String[] args) {
    ListNodes.printList(new Solution().rotateRight(ListNodes.buildList(new int[]{1,2,3,4,5}), 2));
  }
}

package com.star.l0019;

import com.star.utils.ListNode;
import com.star.utils.ListNodes;
import org.junit.Test;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  //给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;

    for (int i = 1; i <= n+1; i++) {
      first = first.next;
    }

    while (first != null) {
      first = first.next;
      second = second.next;
    }

    second.next = second.next.next;

    return dummy.next;
  }

  @Test
  public void Test(){
    ListNodes.printList(removeNthFromEnd(ListNodes.buildList(new int[]{1,2,3,4,5}), 3));
  }
}

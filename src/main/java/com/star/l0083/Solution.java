package com.star.l0083;

import com.star.utils.ListNode;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null){
      return head;
    }

    ListNode pos = head;
    while (pos != null && pos.next != null) {
      if (pos.val == pos.next.val){
        pos.next = pos.next.next; //删除元素
      }else {
        pos = pos.next;
      }
    }
    return head;
  }
}

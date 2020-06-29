package com.star.l0082;

import com.star.utils.ListNode;
import com.star.utils.ListNodes;

/**
 * @author star
 * @Date 2020/6/27.
 * @Description: No Description Yet.
 */
public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode prev = new ListNode(0);
    prev.next = head;

    ListNode pos = prev;
    pos.next = head;
    while (pos.next != null && pos.next.next != null) {
      if (pos.next.val == pos.next.next.val) {
        if (pos.next.next.next != null) {
          if (pos.next.next.next.val == pos.next.val) {
            deleteNode(pos);
          }else {
            deleteTwoNode(pos);
          }
        }else {
          deleteTwoNode(pos);
        }
      }else {
        pos = pos.next;
      }
    }

    return prev.next;
  }

  /**
   * 删除prev的next节点
   * @param prev 被删除节点的前序节点
   */
  public void deleteNode(ListNode prev){
    if (prev.next == null) return;
    prev.next.next = prev.next.next.next;
  }

  /**
   * 删除prev的next 和 next.next节点
   * @param prev 被删除节点的前序节点
   * 如果next或者next.next有一个为null，不作任何操作
   */
  public void deleteTwoNode(ListNode prev){
    if (prev.next == null || prev.next.next == null) return;
    prev.next = prev.next.next.next;
  }

  public static void main(String[] args) {
    ListNodes.printList(new Solution().deleteDuplicates(ListNodes.buildList(new int[]{1,1,1,2,3})));
  }
}

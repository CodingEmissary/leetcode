package com.star.m0201;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author star
 * @Date 2020/6/26.
 * @Description: No Description Yet.
 */
public class Solution {
  //编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
  //如果不得使用临时缓冲区，该怎么解决？
  public ListNode removeDuplicateNodes(ListNode head) {
    Set<Integer> cache = new HashSet<>();

    ListNode prev = new ListNode(0);
    prev.next = head;

    while (prev.next != null) {
      ListNode tmp = prev.next;
      if (cache.contains(tmp.val)) {
        prev.next = tmp.next;
      }else {
        cache.add(tmp.val);
        prev = tmp;
      }
    }
    return head;
  }

  @Test
  public void Test(){
    ListNode n = buildList(new int[]{1,2,3,3,2,1});
    printList(removeDuplicateNodes(n));
  }

  public static ListNode buildList(int[] nums) {
    ListNode root = null;
    ListNode last = root;
    for (int num:nums) {
      ListNode cur = new ListNode(num);
      if (root == null) {
        root = cur;
        last = root;
      }else {
        last.next = cur;
        last = cur;
      }
    }

    return root;
  }

  public static void printList(ListNode root){
    if (root == null) {return;}
    while (root != null) {
      System.out.println(root.val);
      root = root.next;
    }
  }
}
